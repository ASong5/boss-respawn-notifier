package com.bossrespawnnotifier;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Notification;
import net.runelite.client.config.Range;

@ConfigGroup("bossrespawnnotifier")
public interface BossRespawnNotifierConfig extends Config
{

	@ConfigItem(
		keyName = "defaultNotification",
		name = "Default notification",
		description = "Default notification type for all bosses.",
		position = 0
	)
	default Notification defaultNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "globalLeadTime",
		name = "Global lead time (seconds)",
		description = "How many seconds before respawn to send a notification.",
		position = 1
	)
	default int globalLeadTime()
	{
		return 3;
	}
	@ConfigSection(
		name = "Alchemical Hydra",
		description = "Settings for Alchemical Hydra",
		position = 2,
		closedByDefault = true
	)
	String alchemical_hydraSection = "alchemical_hydrasection";

	@ConfigItem(
		keyName = "alchemical_hydraOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = alchemical_hydraSection,
		position = 0
	)
	default boolean alchemical_hydraOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "alchemical_hydraNotification",
		name = "Notification",
		description = "Send a notification when Alchemical Hydra is about to respawn. Only applies when override is checked.",
		section = alchemical_hydraSection,
		position = 1
	)
	default Notification alchemical_hydraNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "alchemical_hydraLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = alchemical_hydraSection,
		position = 2
	)
	default int alchemical_hydraLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Amoxliatl",
		description = "Settings for Amoxliatl",
		position = 3,
		closedByDefault = true
	)
	String amoxliatlSection = "amoxliatlsection";

	@ConfigItem(
		keyName = "amoxliatlOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = amoxliatlSection,
		position = 0
	)
	default boolean amoxliatlOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "amoxliatlNotification",
		name = "Notification",
		description = "Send a notification when Amoxliatl is about to respawn. Only applies when override is checked.",
		section = amoxliatlSection,
		position = 1
	)
	default Notification amoxliatlNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "amoxliatlLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = amoxliatlSection,
		position = 2
	)
	default int amoxliatlLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Araxxor",
		description = "Settings for Araxxor",
		position = 4,
		closedByDefault = true
	)
	String araxxorSection = "araxxorsection";

	@ConfigItem(
		keyName = "araxxorOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = araxxorSection,
		position = 0
	)
	default boolean araxxorOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "araxxorNotification",
		name = "Notification",
		description = "Send a notification when Araxxor is about to respawn. Only applies when override is checked.",
		section = araxxorSection,
		position = 1
	)
	default Notification araxxorNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "araxxorLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = araxxorSection,
		position = 2
	)
	default int araxxorLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Artio",
		description = "Settings for Artio",
		position = 5,
		closedByDefault = true
	)
	String artioSection = "artiosection";

	@ConfigItem(
		keyName = "artioOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = artioSection,
		position = 0
	)
	default boolean artioOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "artioNotification",
		name = "Notification",
		description = "Send a notification when Artio is about to respawn. Only applies when override is checked.",
		section = artioSection,
		position = 1
	)
	default Notification artioNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "artioLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = artioSection,
		position = 2
	)
	default int artioLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Brutus",
		description = "Settings for Brutus",
		position = 6,
		closedByDefault = true
	)
	String brutusSection = "brutussection";

	@ConfigItem(
		keyName = "brutusOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = brutusSection,
		position = 0
	)
	default boolean brutusOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "brutusNotification",
		name = "Notification",
		description = "Send a notification when Brutus is about to respawn. Only applies when override is checked.",
		section = brutusSection,
		position = 1
	)
	default Notification brutusNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "brutusLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = brutusSection,
		position = 2
	)
	default int brutusLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Callisto",
		description = "Settings for Callisto",
		position = 7,
		closedByDefault = true
	)
	String callistoSection = "callistosection";

	@ConfigItem(
		keyName = "callistoOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = callistoSection,
		position = 0
	)
	default boolean callistoOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "callistoNotification",
		name = "Notification",
		description = "Send a notification when Callisto is about to respawn. Only applies when override is checked.",
		section = callistoSection,
		position = 1
	)
	default Notification callistoNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "callistoLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = callistoSection,
		position = 2
	)
	default int callistoLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Calvarion",
		description = "Settings for Calvarion",
		position = 8,
		closedByDefault = true
	)
	String calvarionSection = "calvarionsection";

	@ConfigItem(
		keyName = "calvarionOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = calvarionSection,
		position = 0
	)
	default boolean calvarionOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "calvarionNotification",
		name = "Notification",
		description = "Send a notification when Calvarion is about to respawn. Only applies when override is checked.",
		section = calvarionSection,
		position = 1
	)
	default Notification calvarionNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "calvarionLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = calvarionSection,
		position = 2
	)
	default int calvarionLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Cerberus",
		description = "Settings for Cerberus",
		position = 9,
		closedByDefault = true
	)
	String cerberusSection = "cerberussection";

	@ConfigItem(
		keyName = "cerberusOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = cerberusSection,
		position = 0
	)
	default boolean cerberusOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "cerberusNotification",
		name = "Notification",
		description = "Send a notification when Cerberus is about to respawn. Only applies when override is checked.",
		section = cerberusSection,
		position = 1
	)
	default Notification cerberusNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "cerberusLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = cerberusSection,
		position = 2
	)
	default int cerberusLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Chaos Elemental",
		description = "Settings for Chaos Elemental",
		position = 10,
		closedByDefault = true
	)
	String chaos_elementalSection = "chaos_elementalsection";

	@ConfigItem(
		keyName = "chaos_elementalOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = chaos_elementalSection,
		position = 0
	)
	default boolean chaos_elementalOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "chaos_elementalNotification",
		name = "Notification",
		description = "Send a notification when Chaos Elemental is about to respawn. Only applies when override is checked.",
		section = chaos_elementalSection,
		position = 1
	)
	default Notification chaos_elementalNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "chaos_elementalLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = chaos_elementalSection,
		position = 2
	)
	default int chaos_elementalLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Chaos Fanatic",
		description = "Settings for Chaos Fanatic",
		position = 11,
		closedByDefault = true
	)
	String chaos_fanaticSection = "chaos_fanaticsection";

	@ConfigItem(
		keyName = "chaos_fanaticOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = chaos_fanaticSection,
		position = 0
	)
	default boolean chaos_fanaticOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "chaos_fanaticNotification",
		name = "Notification",
		description = "Send a notification when Chaos Fanatic is about to respawn. Only applies when override is checked.",
		section = chaos_fanaticSection,
		position = 1
	)
	default Notification chaos_fanaticNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "chaos_fanaticLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = chaos_fanaticSection,
		position = 2
	)
	default int chaos_fanaticLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Commander Zilyana",
		description = "Settings for Commander Zilyana",
		position = 12,
		closedByDefault = true
	)
	String commander_zilyanaSection = "commander_zilyanasection";

	@ConfigItem(
		keyName = "commander_zilyanaOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = commander_zilyanaSection,
		position = 0
	)
	default boolean commander_zilyanaOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "commander_zilyanaNotification",
		name = "Notification",
		description = "Send a notification when Commander Zilyana is about to respawn. Only applies when override is checked.",
		section = commander_zilyanaSection,
		position = 1
	)
	default Notification commander_zilyanaNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "commander_zilyanaLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = commander_zilyanaSection,
		position = 2
	)
	default int commander_zilyanaLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Corporeal Beast",
		description = "Settings for Corporeal Beast",
		position = 13,
		closedByDefault = true
	)
	String corporeal_beastSection = "corporeal_beastsection";

	@ConfigItem(
		keyName = "corporeal_beastOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = corporeal_beastSection,
		position = 0
	)
	default boolean corporeal_beastOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "corporeal_beastNotification",
		name = "Notification",
		description = "Send a notification when Corporeal Beast is about to respawn. Only applies when override is checked.",
		section = corporeal_beastSection,
		position = 1
	)
	default Notification corporeal_beastNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "corporeal_beastLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = corporeal_beastSection,
		position = 2
	)
	default int corporeal_beastLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Crazy Archaeologist",
		description = "Settings for Crazy Archaeologist",
		position = 14,
		closedByDefault = true
	)
	String crazy_archaeologistSection = "crazy_archaeologistsection";

	@ConfigItem(
		keyName = "crazy_archaeologistOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = crazy_archaeologistSection,
		position = 0
	)
	default boolean crazy_archaeologistOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "crazy_archaeologistNotification",
		name = "Notification",
		description = "Send a notification when Crazy Archaeologist is about to respawn. Only applies when override is checked.",
		section = crazy_archaeologistSection,
		position = 1
	)
	default Notification crazy_archaeologistNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "crazy_archaeologistLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = crazy_archaeologistSection,
		position = 2
	)
	default int crazy_archaeologistLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Dagannoth Prime",
		description = "Settings for Dagannoth Prime",
		position = 15,
		closedByDefault = true
	)
	String dagannoth_primeSection = "dagannoth_primesection";

	@ConfigItem(
		keyName = "dagannoth_primeOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = dagannoth_primeSection,
		position = 0
	)
	default boolean dagannoth_primeOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "dagannoth_primeNotification",
		name = "Notification",
		description = "Send a notification when Dagannoth Prime is about to respawn. Only applies when override is checked.",
		section = dagannoth_primeSection,
		position = 1
	)
	default Notification dagannoth_primeNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "dagannoth_primeLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = dagannoth_primeSection,
		position = 2
	)
	default int dagannoth_primeLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Dagannoth Rex",
		description = "Settings for Dagannoth Rex",
		position = 16,
		closedByDefault = true
	)
	String dagannoth_rexSection = "dagannoth_rexsection";

	@ConfigItem(
		keyName = "dagannoth_rexOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = dagannoth_rexSection,
		position = 0
	)
	default boolean dagannoth_rexOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "dagannoth_rexNotification",
		name = "Notification",
		description = "Send a notification when Dagannoth Rex is about to respawn. Only applies when override is checked.",
		section = dagannoth_rexSection,
		position = 1
	)
	default Notification dagannoth_rexNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "dagannoth_rexLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = dagannoth_rexSection,
		position = 2
	)
	default int dagannoth_rexLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Dagannoth Supreme",
		description = "Settings for Dagannoth Supreme",
		position = 17,
		closedByDefault = true
	)
	String dagannoth_supremeSection = "dagannoth_supremesection";

	@ConfigItem(
		keyName = "dagannoth_supremeOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = dagannoth_supremeSection,
		position = 0
	)
	default boolean dagannoth_supremeOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "dagannoth_supremeNotification",
		name = "Notification",
		description = "Send a notification when Dagannoth Supreme is about to respawn. Only applies when override is checked.",
		section = dagannoth_supremeSection,
		position = 1
	)
	default Notification dagannoth_supremeNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "dagannoth_supremeLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = dagannoth_supremeSection,
		position = 2
	)
	default int dagannoth_supremeLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Deranged Archaeologist",
		description = "Settings for Deranged Archaeologist",
		position = 18,
		closedByDefault = true
	)
	String deranged_archaeologistSection = "deranged_archaeologistsection";

	@ConfigItem(
		keyName = "deranged_archaeologistOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = deranged_archaeologistSection,
		position = 0
	)
	default boolean deranged_archaeologistOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "deranged_archaeologistNotification",
		name = "Notification",
		description = "Send a notification when Deranged Archaeologist is about to respawn. Only applies when override is checked.",
		section = deranged_archaeologistSection,
		position = 1
	)
	default Notification deranged_archaeologistNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "deranged_archaeologistLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = deranged_archaeologistSection,
		position = 2
	)
	default int deranged_archaeologistLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Dusk",
		description = "Settings for Dusk",
		position = 19,
		closedByDefault = true
	)
	String duskSection = "dusksection";

	@ConfigItem(
		keyName = "duskOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = duskSection,
		position = 0
	)
	default boolean duskOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "duskNotification",
		name = "Notification",
		description = "Send a notification when Dusk is about to respawn. Only applies when override is checked.",
		section = duskSection,
		position = 1
	)
	default Notification duskNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "duskLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = duskSection,
		position = 2
	)
	default int duskLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "General Graardor",
		description = "Settings for General Graardor",
		position = 20,
		closedByDefault = true
	)
	String general_graardorSection = "general_graardorsection";

	@ConfigItem(
		keyName = "general_graardorOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = general_graardorSection,
		position = 0
	)
	default boolean general_graardorOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "general_graardorNotification",
		name = "Notification",
		description = "Send a notification when General Graardor is about to respawn. Only applies when override is checked.",
		section = general_graardorSection,
		position = 1
	)
	default Notification general_graardorNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "general_graardorLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = general_graardorSection,
		position = 2
	)
	default int general_graardorLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Giant Mole",
		description = "Settings for Giant Mole",
		position = 21,
		closedByDefault = true
	)
	String giant_moleSection = "giant_molesection";

	@ConfigItem(
		keyName = "giant_moleOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = giant_moleSection,
		position = 0
	)
	default boolean giant_moleOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "giant_moleNotification",
		name = "Notification",
		description = "Send a notification when Giant Mole is about to respawn. Only applies when override is checked.",
		section = giant_moleSection,
		position = 1
	)
	default Notification giant_moleNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "giant_moleLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = giant_moleSection,
		position = 2
	)
	default int giant_moleLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Hueycoatl",
		description = "Settings for Hueycoatl",
		position = 22,
		closedByDefault = true
	)
	String hueycoatlSection = "hueycoatlsection";

	@ConfigItem(
		keyName = "hueycoatlOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = hueycoatlSection,
		position = 0
	)
	default boolean hueycoatlOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "hueycoatlNotification",
		name = "Notification",
		description = "Send a notification when Hueycoatl is about to respawn. Only applies when override is checked.",
		section = hueycoatlSection,
		position = 1
	)
	default Notification hueycoatlNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "hueycoatlLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = hueycoatlSection,
		position = 2
	)
	default int hueycoatlLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Kalphite Queen",
		description = "Settings for Kalphite Queen",
		position = 23,
		closedByDefault = true
	)
	String kalphite_queenSection = "kalphite_queensection";

	@ConfigItem(
		keyName = "kalphite_queenOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = kalphite_queenSection,
		position = 0
	)
	default boolean kalphite_queenOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "kalphite_queenNotification",
		name = "Notification",
		description = "Send a notification when Kalphite Queen is about to respawn. Only applies when override is checked.",
		section = kalphite_queenSection,
		position = 1
	)
	default Notification kalphite_queenNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "kalphite_queenLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = kalphite_queenSection,
		position = 2
	)
	default int kalphite_queenLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "King Black Dragon",
		description = "Settings for King Black Dragon",
		position = 24,
		closedByDefault = true
	)
	String king_black_dragonSection = "king_black_dragonsection";

	@ConfigItem(
		keyName = "king_black_dragonOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = king_black_dragonSection,
		position = 0
	)
	default boolean king_black_dragonOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "king_black_dragonNotification",
		name = "Notification",
		description = "Send a notification when King Black Dragon is about to respawn. Only applies when override is checked.",
		section = king_black_dragonSection,
		position = 1
	)
	default Notification king_black_dragonNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "king_black_dragonLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = king_black_dragonSection,
		position = 2
	)
	default int king_black_dragonLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Kraken",
		description = "Settings for Kraken",
		position = 25,
		closedByDefault = true
	)
	String krakenSection = "krakensection";

	@ConfigItem(
		keyName = "krakenOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = krakenSection,
		position = 0
	)
	default boolean krakenOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "krakenNotification",
		name = "Notification",
		description = "Send a notification when Kraken is about to respawn. Only applies when override is checked.",
		section = krakenSection,
		position = 1
	)
	default Notification krakenNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "krakenLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = krakenSection,
		position = 2
	)
	default int krakenLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Kreearra",
		description = "Settings for Kreearra",
		position = 26,
		closedByDefault = true
	)
	String kreearraSection = "kreearrasection";

	@ConfigItem(
		keyName = "kreearraOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = kreearraSection,
		position = 0
	)
	default boolean kreearraOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "kreearraNotification",
		name = "Notification",
		description = "Send a notification when Kreearra is about to respawn. Only applies when override is checked.",
		section = kreearraSection,
		position = 1
	)
	default Notification kreearraNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "kreearraLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = kreearraSection,
		position = 2
	)
	default int kreearraLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Kril Tsutsaroth",
		description = "Settings for Kril Tsutsaroth",
		position = 27,
		closedByDefault = true
	)
	String kril_tsutsarothSection = "kril_tsutsarothsection";

	@ConfigItem(
		keyName = "kril_tsutsarothOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = kril_tsutsarothSection,
		position = 0
	)
	default boolean kril_tsutsarothOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "kril_tsutsarothNotification",
		name = "Notification",
		description = "Send a notification when Kril Tsutsaroth is about to respawn. Only applies when override is checked.",
		section = kril_tsutsarothSection,
		position = 1
	)
	default Notification kril_tsutsarothNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "kril_tsutsarothLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = kril_tsutsarothSection,
		position = 2
	)
	default int kril_tsutsarothLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Phantom Muspah",
		description = "Settings for Phantom Muspah",
		position = 28,
		closedByDefault = true
	)
	String phantom_muspahSection = "phantom_muspahsection";

	@ConfigItem(
		keyName = "phantom_muspahOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = phantom_muspahSection,
		position = 0
	)
	default boolean phantom_muspahOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "phantom_muspahNotification",
		name = "Notification",
		description = "Send a notification when Phantom Muspah is about to respawn. Only applies when override is checked.",
		section = phantom_muspahSection,
		position = 1
	)
	default Notification phantom_muspahNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "phantom_muspahLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = phantom_muspahSection,
		position = 2
	)
	default int phantom_muspahLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Sarachnis",
		description = "Settings for Sarachnis",
		position = 29,
		closedByDefault = true
	)
	String sarachnisSection = "sarachnissection";

	@ConfigItem(
		keyName = "sarachnisOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = sarachnisSection,
		position = 0
	)
	default boolean sarachnisOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "sarachnisNotification",
		name = "Notification",
		description = "Send a notification when Sarachnis is about to respawn. Only applies when override is checked.",
		section = sarachnisSection,
		position = 1
	)
	default Notification sarachnisNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "sarachnisLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = sarachnisSection,
		position = 2
	)
	default int sarachnisLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Scorpia",
		description = "Settings for Scorpia",
		position = 30,
		closedByDefault = true
	)
	String scorpiaSection = "scorpiasection";

	@ConfigItem(
		keyName = "scorpiaOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = scorpiaSection,
		position = 0
	)
	default boolean scorpiaOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "scorpiaNotification",
		name = "Notification",
		description = "Send a notification when Scorpia is about to respawn. Only applies when override is checked.",
		section = scorpiaSection,
		position = 1
	)
	default Notification scorpiaNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "scorpiaLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = scorpiaSection,
		position = 2
	)
	default int scorpiaLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Scurrius",
		description = "Settings for Scurrius",
		position = 31,
		closedByDefault = true
	)
	String scurriusSection = "scurriussection";

	@ConfigItem(
		keyName = "scurriusOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = scurriusSection,
		position = 0
	)
	default boolean scurriusOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "scurriusNotification",
		name = "Notification",
		description = "Send a notification when Scurrius is about to respawn. Only applies when override is checked.",
		section = scurriusSection,
		position = 1
	)
	default Notification scurriusNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "scurriusLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = scurriusSection,
		position = 2
	)
	default int scurriusLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Scurrius Private",
		description = "Settings for Scurrius Private",
		position = 32,
		closedByDefault = true
	)
	String scurrius_privateSection = "scurrius_privatesection";

	@ConfigItem(
		keyName = "scurrius_privateOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = scurrius_privateSection,
		position = 0
	)
	default boolean scurrius_privateOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "scurrius_privateNotification",
		name = "Notification",
		description = "Send a notification when Scurrius Private is about to respawn. Only applies when override is checked.",
		section = scurrius_privateSection,
		position = 1
	)
	default Notification scurrius_privateNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "scurrius_privateLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = scurrius_privateSection,
		position = 2
	)
	default int scurrius_privateLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Shellbane Gryphon",
		description = "Settings for Shellbane Gryphon",
		position = 33,
		closedByDefault = true
	)
	String shellbane_gryphonSection = "shellbane_gryphonsection";

	@ConfigItem(
		keyName = "shellbane_gryphonOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = shellbane_gryphonSection,
		position = 0
	)
	default boolean shellbane_gryphonOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "shellbane_gryphonNotification",
		name = "Notification",
		description = "Send a notification when Shellbane Gryphon is about to respawn. Only applies when override is checked.",
		section = shellbane_gryphonSection,
		position = 1
	)
	default Notification shellbane_gryphonNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "shellbane_gryphonLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = shellbane_gryphonSection,
		position = 2
	)
	default int shellbane_gryphonLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Spindel",
		description = "Settings for Spindel",
		position = 34,
		closedByDefault = true
	)
	String spindelSection = "spindelsection";

	@ConfigItem(
		keyName = "spindelOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = spindelSection,
		position = 0
	)
	default boolean spindelOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "spindelNotification",
		name = "Notification",
		description = "Send a notification when Spindel is about to respawn. Only applies when override is checked.",
		section = spindelSection,
		position = 1
	)
	default Notification spindelNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "spindelLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = spindelSection,
		position = 2
	)
	default int spindelLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "The Leviathan",
		description = "Settings for The Leviathan",
		position = 35,
		closedByDefault = true
	)
	String the_leviathanSection = "the_leviathansection";

	@ConfigItem(
		keyName = "the_leviathanOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = the_leviathanSection,
		position = 0
	)
	default boolean the_leviathanOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "the_leviathanNotification",
		name = "Notification",
		description = "Send a notification when The Leviathan is about to respawn. Only applies when override is checked.",
		section = the_leviathanSection,
		position = 1
	)
	default Notification the_leviathanNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "the_leviathanLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = the_leviathanSection,
		position = 2
	)
	default int the_leviathanLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Thermonuclear Smoke Devil",
		description = "Settings for Thermonuclear Smoke Devil",
		position = 36,
		closedByDefault = true
	)
	String thermonuclear_smoke_devilSection = "thermonuclear_smoke_devilsection";

	@ConfigItem(
		keyName = "thermonuclear_smoke_devilOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = thermonuclear_smoke_devilSection,
		position = 0
	)
	default boolean thermonuclear_smoke_devilOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "thermonuclear_smoke_devilNotification",
		name = "Notification",
		description = "Send a notification when Thermonuclear Smoke Devil is about to respawn. Only applies when override is checked.",
		section = thermonuclear_smoke_devilSection,
		position = 1
	)
	default Notification thermonuclear_smoke_devilNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "thermonuclear_smoke_devilLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = thermonuclear_smoke_devilSection,
		position = 2
	)
	default int thermonuclear_smoke_devilLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Venenatis",
		description = "Settings for Venenatis",
		position = 37,
		closedByDefault = true
	)
	String venenatisSection = "venenatissection";

	@ConfigItem(
		keyName = "venenatisOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = venenatisSection,
		position = 0
	)
	default boolean venenatisOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "venenatisNotification",
		name = "Notification",
		description = "Send a notification when Venenatis is about to respawn. Only applies when override is checked.",
		section = venenatisSection,
		position = 1
	)
	default Notification venenatisNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "venenatisLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = venenatisSection,
		position = 2
	)
	default int venenatisLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Vetion",
		description = "Settings for Vetion",
		position = 38,
		closedByDefault = true
	)
	String vetionSection = "vetionsection";

	@ConfigItem(
		keyName = "vetionOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = vetionSection,
		position = 0
	)
	default boolean vetionOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "vetionNotification",
		name = "Notification",
		description = "Send a notification when Vetion is about to respawn. Only applies when override is checked.",
		section = vetionSection,
		position = 1
	)
	default Notification vetionNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "vetionLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = vetionSection,
		position = 2
	)
	default int vetionLeadTime()
	{
		return 0;
	}
	@ConfigSection(
		name = "Zalcano",
		description = "Settings for Zalcano",
		position = 39,
		closedByDefault = true
	)
	String zalcanoSection = "zalcanosection";

	@ConfigItem(
		keyName = "zalcanoOverride",
		name = "Override default notification",
		description = "Override the default notification for this boss. Unchecked = inherit global default.",
		section = zalcanoSection,
		position = 0
	)
	default boolean zalcanoOverride()
	{
		return false;
	}

	@ConfigItem(
		keyName = "zalcanoNotification",
		name = "Notification",
		description = "Send a notification when Zalcano is about to respawn. Only applies when override is checked.",
		section = zalcanoSection,
		position = 1
	)
	default Notification zalcanoNotification()
	{
		return Notification.ON;
	}

	@Range(min = 0)
	@ConfigItem(
		keyName = "zalcanoLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Only applies when override is checked.",
		section = zalcanoSection,
		position = 2
	)
	default int zalcanoLeadTime()
	{
		return 0;
	}
}