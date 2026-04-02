package com.bossrespawnnotifier;

import com.google.inject.Provides;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcChanged;
import net.runelite.api.events.NpcDespawned;
import net.runelite.client.Notifier;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.Notification;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.NpcUtil;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.util.RSTimeUnit;

@Slf4j
@PluginDescriptor(
	name = "Boss Respawn Notifier",
	description = "Sends notifications when bosses are about to respawn",
	tags = {"boss", "timer", "respawn", "notification", "pvm"}
)
public class BossRespawnNotifierPlugin extends Plugin
{
	private static final String BRUTUS_BELL = "You ring the bell... and hear something approaching.";

	@Inject
	private BossRespawnNotifierConfig config;

	@Inject
	private Notifier notifier;

	@Inject
	private ConfigManager configManager;

	@Inject
	private NpcUtil npcUtil;

	private final Map<Boss, Instant> deathTimes = new HashMap<>();
	private final Map<Boss, Boolean> notified = new HashMap<>();

	@Override
	protected void startUp()
	{
		deathTimes.clear();
		notified.clear();
	}

	@Override
	protected void shutDown()
	{
		deathTimes.clear();
		notified.clear();
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned npcDespawned)
	{
		NPC npc = npcDespawned.getNpc();
		Boss boss = Boss.find(npc.getId());

		if (boss == null)
		{
			return;
		}

		if (!boss.isIgnoreDead() && !npcUtil.isDying(npc))
		{
			return;
		}

		if (getNotification(boss) == Notification.OFF)
		{
			return;
		}

		startTracking(boss);
	}

	@Subscribe
	public void onNpcChanged(NpcChanged npcChanged)
	{
		NPC npc = npcChanged.getNpc();
		Boss boss = Boss.find(npc.getId());

		if (boss != Boss.HUEYCOATL)
		{
			return;
		}

		if (getNotification(boss) == Notification.OFF)
		{
			return;
		}

		startTracking(boss);
	}

	@Subscribe
	public void onChatMessage(ChatMessage ev)
	{
		if (ev.getType() != ChatMessageType.MESBOX || !BRUTUS_BELL.equals(ev.getMessage()))
		{
			return;
		}

		if (!deathTimes.containsKey(Boss.BRUTUS))
		{
			return;
		}

		// cowbell shortens brutus respawn to 12 game ticks
		Duration reducedTime = Duration.of(12, RSTimeUnit.GAME_TICKS);
		Instant newDeathTime = Instant.now().minus(Boss.BRUTUS.getSpawnTime()).plus(reducedTime);
		deathTimes.put(Boss.BRUTUS, newDeathTime);
		notified.put(Boss.BRUTUS, false);
	}

	@Subscribe
	public void onGameTick(GameTick gameTick)
	{
		Instant now = Instant.now();

		for (Map.Entry<Boss, Instant> entry : deathTimes.entrySet())
		{
			Boss boss = entry.getKey();
			Instant deathTime = entry.getValue();

			if (Boolean.TRUE.equals(notified.get(boss)))
			{
				continue;
			}

			Instant spawnInstant = deathTime.plus(boss.getSpawnTime());
			long secondsUntilSpawn = Duration.between(now, spawnInstant).getSeconds();
			long leadTime = getLeadTime(boss);

			if (secondsUntilSpawn <= leadTime)
			{
				Notification notification = getNotification(boss);
				notifier.notify(notification, boss.getDisplayName() + " is about to respawn!");
				notified.put(boss, true);
			}
		}

		deathTimes.entrySet().removeIf(entry ->
		{
			Instant spawnInstant = entry.getValue().plus(entry.getKey().getSpawnTime());
			if (now.isAfter(spawnInstant))
			{
				notified.remove(entry.getKey());
				return true;
			}
			return false;
		});
	}

	private void startTracking(Boss boss)
	{
		deathTimes.put(boss, Instant.now());
		notified.put(boss, false);
	}

	private Notification getNotification(Boss boss)
	{
		Notification n = configManager.getConfiguration(
			"bossrespawnnotifier",
			boss.name().toLowerCase() + "Notification",
			Notification.class
		);
		return n != null ? n : Notification.OFF;
	}

	private long getLeadTime(Boss boss)
	{
		Integer override = configManager.getConfiguration(
			"bossrespawnnotifier",
			boss.name().toLowerCase() + "LeadTime",
			Integer.class
		);
		if (override != null && override >= 0)
		{
			return override;
		}
		return config.globalLeadTime();
	}

	@Provides
	BossRespawnNotifierConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(BossRespawnNotifierConfig.class);
	}
}
