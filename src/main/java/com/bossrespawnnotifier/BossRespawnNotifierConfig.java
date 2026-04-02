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

	@Range(min = 0)
	@ConfigItem(
		keyName = "globalLeadTime",
		name = "Global lead time (seconds)",
		description = "How many seconds before respawn to send a notification. Used for any boss with lead time set to -1.",
		position = 0
	)
	default int globalLeadTime()
	{
		return 10;
	}


	@ConfigSection(
		name = "Alchemical Hydra",
		description = "Settings for Alchemical Hydra",
		position = 1,
		closedByDefault = true
	)
	String alchemical_hydraSection = "alchemical_hydrasection";

	@ConfigItem(
		keyName = "alchemical_hydraNotification",
		name = "Notification",
		description = "Send a notification when Alchemical Hydra is about to respawn",
		section = alchemical_hydraSection,
		position = 0
	)
	default Notification alchemical_hydraNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "alchemical_hydraLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = alchemical_hydraSection,
		position = 1
	)
	default int alchemical_hydraLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Amoxliatl",
		description = "Settings for Amoxliatl",
		position = 2,
		closedByDefault = true
	)
	String amoxliatlSection = "amoxliatlsection";

	@ConfigItem(
		keyName = "amoxliatlNotification",
		name = "Notification",
		description = "Send a notification when Amoxliatl is about to respawn",
		section = amoxliatlSection,
		position = 0
	)
	default Notification amoxliatlNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "amoxliatlLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = amoxliatlSection,
		position = 1
	)
	default int amoxliatlLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Araxxor",
		description = "Settings for Araxxor",
		position = 3,
		closedByDefault = true
	)
	String araxxorSection = "araxxorsection";

	@ConfigItem(
		keyName = "araxxorNotification",
		name = "Notification",
		description = "Send a notification when Araxxor is about to respawn",
		section = araxxorSection,
		position = 0
	)
	default Notification araxxorNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "araxxorLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = araxxorSection,
		position = 1
	)
	default int araxxorLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Artio",
		description = "Settings for Artio",
		position = 4,
		closedByDefault = true
	)
	String artioSection = "artiosection";

	@ConfigItem(
		keyName = "artioNotification",
		name = "Notification",
		description = "Send a notification when Artio is about to respawn",
		section = artioSection,
		position = 0
	)
	default Notification artioNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "artioLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = artioSection,
		position = 1
	)
	default int artioLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Brutus",
		description = "Settings for Brutus",
		position = 5,
		closedByDefault = true
	)
	String brutusSection = "brutussection";

	@ConfigItem(
		keyName = "brutusNotification",
		name = "Notification",
		description = "Send a notification when Brutus is about to respawn",
		section = brutusSection,
		position = 0
	)
	default Notification brutusNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "brutusLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = brutusSection,
		position = 1
	)
	default int brutusLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Callisto",
		description = "Settings for Callisto",
		position = 6,
		closedByDefault = true
	)
	String callistoSection = "callistosection";

	@ConfigItem(
		keyName = "callistoNotification",
		name = "Notification",
		description = "Send a notification when Callisto is about to respawn",
		section = callistoSection,
		position = 0
	)
	default Notification callistoNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "callistoLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = callistoSection,
		position = 1
	)
	default int callistoLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Calvarion",
		description = "Settings for Calvarion",
		position = 7,
		closedByDefault = true
	)
	String calvarionSection = "calvarionsection";

	@ConfigItem(
		keyName = "calvarionNotification",
		name = "Notification",
		description = "Send a notification when Calvarion is about to respawn",
		section = calvarionSection,
		position = 0
	)
	default Notification calvarionNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "calvarionLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = calvarionSection,
		position = 1
	)
	default int calvarionLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Cerberus",
		description = "Settings for Cerberus",
		position = 8,
		closedByDefault = true
	)
	String cerberusSection = "cerberussection";

	@ConfigItem(
		keyName = "cerberusNotification",
		name = "Notification",
		description = "Send a notification when Cerberus is about to respawn",
		section = cerberusSection,
		position = 0
	)
	default Notification cerberusNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "cerberusLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = cerberusSection,
		position = 1
	)
	default int cerberusLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Chaos Elemental",
		description = "Settings for Chaos Elemental",
		position = 9,
		closedByDefault = true
	)
	String chaos_elementalSection = "chaos_elementalsection";

	@ConfigItem(
		keyName = "chaos_elementalNotification",
		name = "Notification",
		description = "Send a notification when Chaos Elemental is about to respawn",
		section = chaos_elementalSection,
		position = 0
	)
	default Notification chaos_elementalNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "chaos_elementalLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = chaos_elementalSection,
		position = 1
	)
	default int chaos_elementalLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Chaos Fanatic",
		description = "Settings for Chaos Fanatic",
		position = 10,
		closedByDefault = true
	)
	String chaos_fanaticSection = "chaos_fanaticsection";

	@ConfigItem(
		keyName = "chaos_fanaticNotification",
		name = "Notification",
		description = "Send a notification when Chaos Fanatic is about to respawn",
		section = chaos_fanaticSection,
		position = 0
	)
	default Notification chaos_fanaticNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "chaos_fanaticLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = chaos_fanaticSection,
		position = 1
	)
	default int chaos_fanaticLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Commander Zilyana",
		description = "Settings for Commander Zilyana",
		position = 11,
		closedByDefault = true
	)
	String commander_zilyanaSection = "commander_zilyanasection";

	@ConfigItem(
		keyName = "commander_zilyanaNotification",
		name = "Notification",
		description = "Send a notification when Commander Zilyana is about to respawn",
		section = commander_zilyanaSection,
		position = 0
	)
	default Notification commander_zilyanaNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "commander_zilyanaLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = commander_zilyanaSection,
		position = 1
	)
	default int commander_zilyanaLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Corporeal Beast",
		description = "Settings for Corporeal Beast",
		position = 12,
		closedByDefault = true
	)
	String corporeal_beastSection = "corporeal_beastsection";

	@ConfigItem(
		keyName = "corporeal_beastNotification",
		name = "Notification",
		description = "Send a notification when Corporeal Beast is about to respawn",
		section = corporeal_beastSection,
		position = 0
	)
	default Notification corporeal_beastNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "corporeal_beastLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = corporeal_beastSection,
		position = 1
	)
	default int corporeal_beastLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Crazy Archaeologist",
		description = "Settings for Crazy Archaeologist",
		position = 13,
		closedByDefault = true
	)
	String crazy_archaeologistSection = "crazy_archaeologistsection";

	@ConfigItem(
		keyName = "crazy_archaeologistNotification",
		name = "Notification",
		description = "Send a notification when Crazy Archaeologist is about to respawn",
		section = crazy_archaeologistSection,
		position = 0
	)
	default Notification crazy_archaeologistNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "crazy_archaeologistLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = crazy_archaeologistSection,
		position = 1
	)
	default int crazy_archaeologistLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Dagannoth Prime",
		description = "Settings for Dagannoth Prime",
		position = 14,
		closedByDefault = true
	)
	String dagannoth_primeSection = "dagannoth_primesection";

	@ConfigItem(
		keyName = "dagannoth_primeNotification",
		name = "Notification",
		description = "Send a notification when Dagannoth Prime is about to respawn",
		section = dagannoth_primeSection,
		position = 0
	)
	default Notification dagannoth_primeNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "dagannoth_primeLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = dagannoth_primeSection,
		position = 1
	)
	default int dagannoth_primeLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Dagannoth Rex",
		description = "Settings for Dagannoth Rex",
		position = 15,
		closedByDefault = true
	)
	String dagannoth_rexSection = "dagannoth_rexsection";

	@ConfigItem(
		keyName = "dagannoth_rexNotification",
		name = "Notification",
		description = "Send a notification when Dagannoth Rex is about to respawn",
		section = dagannoth_rexSection,
		position = 0
	)
	default Notification dagannoth_rexNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "dagannoth_rexLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = dagannoth_rexSection,
		position = 1
	)
	default int dagannoth_rexLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Dagannoth Supreme",
		description = "Settings for Dagannoth Supreme",
		position = 16,
		closedByDefault = true
	)
	String dagannoth_supremeSection = "dagannoth_supremesection";

	@ConfigItem(
		keyName = "dagannoth_supremeNotification",
		name = "Notification",
		description = "Send a notification when Dagannoth Supreme is about to respawn",
		section = dagannoth_supremeSection,
		position = 0
	)
	default Notification dagannoth_supremeNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "dagannoth_supremeLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = dagannoth_supremeSection,
		position = 1
	)
	default int dagannoth_supremeLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Deranged Archaeologist",
		description = "Settings for Deranged Archaeologist",
		position = 17,
		closedByDefault = true
	)
	String deranged_archaeologistSection = "deranged_archaeologistsection";

	@ConfigItem(
		keyName = "deranged_archaeologistNotification",
		name = "Notification",
		description = "Send a notification when Deranged Archaeologist is about to respawn",
		section = deranged_archaeologistSection,
		position = 0
	)
	default Notification deranged_archaeologistNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "deranged_archaeologistLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = deranged_archaeologistSection,
		position = 1
	)
	default int deranged_archaeologistLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Dusk",
		description = "Settings for Dusk",
		position = 18,
		closedByDefault = true
	)
	String duskSection = "dusksection";

	@ConfigItem(
		keyName = "duskNotification",
		name = "Notification",
		description = "Send a notification when Dusk is about to respawn",
		section = duskSection,
		position = 0
	)
	default Notification duskNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "duskLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = duskSection,
		position = 1
	)
	default int duskLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "General Graardor",
		description = "Settings for General Graardor",
		position = 19,
		closedByDefault = true
	)
	String general_graardorSection = "general_graardorsection";

	@ConfigItem(
		keyName = "general_graardorNotification",
		name = "Notification",
		description = "Send a notification when General Graardor is about to respawn",
		section = general_graardorSection,
		position = 0
	)
	default Notification general_graardorNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "general_graardorLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = general_graardorSection,
		position = 1
	)
	default int general_graardorLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Giant Mole",
		description = "Settings for Giant Mole",
		position = 20,
		closedByDefault = true
	)
	String giant_moleSection = "giant_molesection";

	@ConfigItem(
		keyName = "giant_moleNotification",
		name = "Notification",
		description = "Send a notification when Giant Mole is about to respawn",
		section = giant_moleSection,
		position = 0
	)
	default Notification giant_moleNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "giant_moleLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = giant_moleSection,
		position = 1
	)
	default int giant_moleLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Hueycoatl",
		description = "Settings for Hueycoatl",
		position = 21,
		closedByDefault = true
	)
	String hueycoatlSection = "hueycoatlsection";

	@ConfigItem(
		keyName = "hueycoatlNotification",
		name = "Notification",
		description = "Send a notification when Hueycoatl is about to respawn",
		section = hueycoatlSection,
		position = 0
	)
	default Notification hueycoatlNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "hueycoatlLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = hueycoatlSection,
		position = 1
	)
	default int hueycoatlLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Kalphite Queen",
		description = "Settings for Kalphite Queen",
		position = 22,
		closedByDefault = true
	)
	String kalphite_queenSection = "kalphite_queensection";

	@ConfigItem(
		keyName = "kalphite_queenNotification",
		name = "Notification",
		description = "Send a notification when Kalphite Queen is about to respawn",
		section = kalphite_queenSection,
		position = 0
	)
	default Notification kalphite_queenNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "kalphite_queenLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = kalphite_queenSection,
		position = 1
	)
	default int kalphite_queenLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "King Black Dragon",
		description = "Settings for King Black Dragon",
		position = 23,
		closedByDefault = true
	)
	String king_black_dragonSection = "king_black_dragonsection";

	@ConfigItem(
		keyName = "king_black_dragonNotification",
		name = "Notification",
		description = "Send a notification when King Black Dragon is about to respawn",
		section = king_black_dragonSection,
		position = 0
	)
	default Notification king_black_dragonNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "king_black_dragonLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = king_black_dragonSection,
		position = 1
	)
	default int king_black_dragonLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Kraken",
		description = "Settings for Kraken",
		position = 24,
		closedByDefault = true
	)
	String krakenSection = "krakensection";

	@ConfigItem(
		keyName = "krakenNotification",
		name = "Notification",
		description = "Send a notification when Kraken is about to respawn",
		section = krakenSection,
		position = 0
	)
	default Notification krakenNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "krakenLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = krakenSection,
		position = 1
	)
	default int krakenLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Kreearra",
		description = "Settings for Kreearra",
		position = 25,
		closedByDefault = true
	)
	String kreearraSection = "kreearrasection";

	@ConfigItem(
		keyName = "kreearraNotification",
		name = "Notification",
		description = "Send a notification when Kreearra is about to respawn",
		section = kreearraSection,
		position = 0
	)
	default Notification kreearraNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "kreearraLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = kreearraSection,
		position = 1
	)
	default int kreearraLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Kril Tsutsaroth",
		description = "Settings for Kril Tsutsaroth",
		position = 26,
		closedByDefault = true
	)
	String kril_tsutsarothSection = "kril_tsutsarothsection";

	@ConfigItem(
		keyName = "kril_tsutsarothNotification",
		name = "Notification",
		description = "Send a notification when Kril Tsutsaroth is about to respawn",
		section = kril_tsutsarothSection,
		position = 0
	)
	default Notification kril_tsutsarothNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "kril_tsutsarothLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = kril_tsutsarothSection,
		position = 1
	)
	default int kril_tsutsarothLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Phantom Muspah",
		description = "Settings for Phantom Muspah",
		position = 27,
		closedByDefault = true
	)
	String phantom_muspahSection = "phantom_muspahsection";

	@ConfigItem(
		keyName = "phantom_muspahNotification",
		name = "Notification",
		description = "Send a notification when Phantom Muspah is about to respawn",
		section = phantom_muspahSection,
		position = 0
	)
	default Notification phantom_muspahNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "phantom_muspahLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = phantom_muspahSection,
		position = 1
	)
	default int phantom_muspahLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Sarachnis",
		description = "Settings for Sarachnis",
		position = 28,
		closedByDefault = true
	)
	String sarachnisSection = "sarachnissection";

	@ConfigItem(
		keyName = "sarachnisNotification",
		name = "Notification",
		description = "Send a notification when Sarachnis is about to respawn",
		section = sarachnisSection,
		position = 0
	)
	default Notification sarachnisNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "sarachnisLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = sarachnisSection,
		position = 1
	)
	default int sarachnisLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Scorpia",
		description = "Settings for Scorpia",
		position = 29,
		closedByDefault = true
	)
	String scorpiaSection = "scorpiasection";

	@ConfigItem(
		keyName = "scorpiaNotification",
		name = "Notification",
		description = "Send a notification when Scorpia is about to respawn",
		section = scorpiaSection,
		position = 0
	)
	default Notification scorpiaNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "scorpiaLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = scorpiaSection,
		position = 1
	)
	default int scorpiaLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Scurrius",
		description = "Settings for Scurrius",
		position = 30,
		closedByDefault = true
	)
	String scurriusSection = "scurriussection";

	@ConfigItem(
		keyName = "scurriusNotification",
		name = "Notification",
		description = "Send a notification when Scurrius is about to respawn",
		section = scurriusSection,
		position = 0
	)
	default Notification scurriusNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "scurriusLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = scurriusSection,
		position = 1
	)
	default int scurriusLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Scurrius Private",
		description = "Settings for Scurrius Private",
		position = 31,
		closedByDefault = true
	)
	String scurrius_privateSection = "scurrius_privatesection";

	@ConfigItem(
		keyName = "scurrius_privateNotification",
		name = "Notification",
		description = "Send a notification when Scurrius Private is about to respawn",
		section = scurrius_privateSection,
		position = 0
	)
	default Notification scurrius_privateNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "scurrius_privateLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = scurrius_privateSection,
		position = 1
	)
	default int scurrius_privateLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Shellbane Gryphon",
		description = "Settings for Shellbane Gryphon",
		position = 32,
		closedByDefault = true
	)
	String shellbane_gryphonSection = "shellbane_gryphonsection";

	@ConfigItem(
		keyName = "shellbane_gryphonNotification",
		name = "Notification",
		description = "Send a notification when Shellbane Gryphon is about to respawn",
		section = shellbane_gryphonSection,
		position = 0
	)
	default Notification shellbane_gryphonNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "shellbane_gryphonLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = shellbane_gryphonSection,
		position = 1
	)
	default int shellbane_gryphonLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Spindel",
		description = "Settings for Spindel",
		position = 33,
		closedByDefault = true
	)
	String spindelSection = "spindelsection";

	@ConfigItem(
		keyName = "spindelNotification",
		name = "Notification",
		description = "Send a notification when Spindel is about to respawn",
		section = spindelSection,
		position = 0
	)
	default Notification spindelNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "spindelLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = spindelSection,
		position = 1
	)
	default int spindelLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "The Leviathan",
		description = "Settings for The Leviathan",
		position = 34,
		closedByDefault = true
	)
	String the_leviathanSection = "the_leviathansection";

	@ConfigItem(
		keyName = "the_leviathanNotification",
		name = "Notification",
		description = "Send a notification when The Leviathan is about to respawn",
		section = the_leviathanSection,
		position = 0
	)
	default Notification the_leviathanNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "the_leviathanLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = the_leviathanSection,
		position = 1
	)
	default int the_leviathanLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Thermonuclear Smoke Devil",
		description = "Settings for Thermonuclear Smoke Devil",
		position = 35,
		closedByDefault = true
	)
	String thermonuclear_smoke_devilSection = "thermonuclear_smoke_devilsection";

	@ConfigItem(
		keyName = "thermonuclear_smoke_devilNotification",
		name = "Notification",
		description = "Send a notification when Thermonuclear Smoke Devil is about to respawn",
		section = thermonuclear_smoke_devilSection,
		position = 0
	)
	default Notification thermonuclear_smoke_devilNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "thermonuclear_smoke_devilLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = thermonuclear_smoke_devilSection,
		position = 1
	)
	default int thermonuclear_smoke_devilLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Venenatis",
		description = "Settings for Venenatis",
		position = 36,
		closedByDefault = true
	)
	String venenatisSection = "venenatissection";

	@ConfigItem(
		keyName = "venenatisNotification",
		name = "Notification",
		description = "Send a notification when Venenatis is about to respawn",
		section = venenatisSection,
		position = 0
	)
	default Notification venenatisNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "venenatisLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = venenatisSection,
		position = 1
	)
	default int venenatisLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Vetion",
		description = "Settings for Vetion",
		position = 37,
		closedByDefault = true
	)
	String vetionSection = "vetionsection";

	@ConfigItem(
		keyName = "vetionNotification",
		name = "Notification",
		description = "Send a notification when Vetion is about to respawn",
		section = vetionSection,
		position = 0
	)
	default Notification vetionNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "vetionLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = vetionSection,
		position = 1
	)
	default int vetionLeadTime()
	{
		return -1;
	}


	@ConfigSection(
		name = "Zalcano",
		description = "Settings for Zalcano",
		position = 38,
		closedByDefault = true
	)
	String zalcanoSection = "zalcanosection";

	@ConfigItem(
		keyName = "zalcanoNotification",
		name = "Notification",
		description = "Send a notification when Zalcano is about to respawn",
		section = zalcanoSection,
		position = 0
	)
	default Notification zalcanoNotification()
	{
		return Notification.ON;
	}

	@Range(min = -1)
	@ConfigItem(
		keyName = "zalcanoLeadTime",
		name = "Lead time (seconds)",
		description = "Seconds before respawn to notify. Set to -1 to use global lead time.",
		section = zalcanoSection,
		position = 1
	)
	default int zalcanoLeadTime()
	{
		return -1;
	}

}
