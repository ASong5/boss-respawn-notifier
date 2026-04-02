package com.bossrespawnnotifier;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class BossRespawnNotifierPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(BossRespawnNotifierPlugin.class);
		RuneLite.main(args);
	}
}