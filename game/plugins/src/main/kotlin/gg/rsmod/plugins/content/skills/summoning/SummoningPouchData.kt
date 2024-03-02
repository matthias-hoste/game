package gg.rsmod.plugins.content.skills.summoning

import gg.rsmod.plugins.api.cfg.Items
import gg.rsmod.plugins.api.cfg.Npcs

enum class SummoningPouchData(
    val tertiary: Array<Int>,
    val charm: Int,
    val shards: Int,
    val summonExperience: Double,
    val creationExperience: Double,
    val pouch: Int,
    val level: Int,
    val npc: Int,
    val shardSwapLevel: Int,
    val numSwapShards: Int) {
    SPIRIT_WOLF(arrayOf(Items.WOLF_BONES), Items.GOLD_CHARM, 7, 0.1, 4.8, Items.SPIRIT_WOLF_POUCH, 1, Npcs.SPIRIT_WOLF, 21, 5),
    DREADFOWL(arrayOf(Items.RAW_CHICKEN), Items.GOLD_CHARM, 8, 0.1, 9.3, Items.DREADFOWL_POUCH, 4, Npcs.DREADFOWL, 21, 6),
    SPIRIT_SPIDER(arrayOf(Items.SPIDER_CARCASS), Items.GOLD_CHARM, 8, 0.2, 12.6, Items.SPIRIT_SPIDER_POUCH, 10, Npcs.SPIRIT_SPIDER, 21, 6),
    THORNY_SNAIL(arrayOf(Items.THIN_SNAIL), Items.GOLD_CHARM, 9, 0.2, 12.6, Items.THORNY_SNAIL_POUCH, 13, Npcs.THORNY_SNAIL, 23, 7),
    GRANITE_CRAB(arrayOf(Items.IRON_ORE), Items.GOLD_CHARM, 7, 0.2, 21.6, Items.GRANITE_CRAB_POUCH, 16, Npcs.GRANITE_CRAB, 26, 5),
    SPIRIT_MOSQUITO(arrayOf(Items.PROBOSCIS), Items.GOLD_CHARM, 1, 0.5, 46.5, Items.SPIRIT_MOSQUITO_POUCH, 17, Npcs.SPIRIT_MOSQUITO, 27, 1),
    DESERT_WYRM(arrayOf(Items.BUCKET_OF_SAND), Items.GREEN_CHARM, 45, 0.4, 31.2, Items.DESERT_WYRM_POUCH, 18, Npcs.DESERT_WYRM, 28, 32),
    SPIRIT_SCORPION(arrayOf(Items.BRONZE_CLAWS), Items.CRIMSON_CHARM, 57, 0.9, 83.2, Items.SPIRIT_SCORPION_POUCH, 19, Npcs.SPIRIT_SCORPION, 29, 40),
    SPIRIT_TZ_KIH(arrayOf(Items.OBSIDIAN_CHARM), Items.CRIMSON_CHARM, 64, 1.1, 96.8, Items.SPIRIT_TZKIH_POUCH, 22, Npcs.SPIRIT_TZKIH_7362, 31, 45),
    ALBINO_RAT(arrayOf(Items.RAW_RAT_MEAT), Items.BLUE_CHARM, 75, 2.3, 202.4, Items.ALBINO_RAT_POUCH, 23, Npcs.ALBINO_RAT, 32, 53),
    SPIRIT_KALPHITE(arrayOf(Items.POTATO_CACTUS), Items.BLUE_CHARM, 51, 2.5, 220.0, Items.SPIRIT_KALPHITE_POUCH, 25, Npcs.SPIRIT_KALPHITE, 34, 36),
    COMPOST_MOUND(arrayOf(Items.COMPOST), Items.GREEN_CHARM, 47, 0.6, 49.8, Items.COMPOST_MOUND_POUCH, 28, Npcs.COMPOST_MOUND, 37, 33),
    GIANT_CHINCHOMPA(arrayOf(Items.CHINCHOMPA), Items.BLUE_CHARM, 84, 2.9, 225.2, Items.GIANT_CHINCHOMPA_POUCH, 29, Npcs.GIANT_CHINCHOMPA, 38, 59),
    VAMPYRE_BAT(arrayOf(Items.VAMPYRE_DUST), Items.CRIMSON_CHARM, 81, 1.5, 136.0, Items.VAMPYRE_BAT_POUCH, 31, Npcs.VAMPYRE_BAT, 39, 57),
    HONEY_BADGER(arrayOf(Items.HONEYCOMB), Items.CRIMSON_CHARM, 84, 1.6, 140.8, Items.HONEY_BADGER_POUCH, 32, Npcs.HONEY_BADGER, 40, 59),
    BEAVER(arrayOf(Items.WILLOW_LOGS), Items.GREEN_CHARM, 72, 0.7, 57.6, Items.BEAVER_POUCH, 33, Npcs.BEAVER, 41, 51),
    VOID_RAVAGER(arrayOf(Items.RAVAGER_CHARM), Items.GREEN_CHARM, 74, 0.7, 59.6, Items.VOID_RAVAGER_POUCH, 34, Npcs.VOID_RAVAGER, 42, 52),
    VOID_SHIFTER(arrayOf(Items.SHIFTER_CHARM), Items.BLUE_CHARM, 74, 0.7, 59.6, Items.VOID_SHIFTER_POUCH, 34, Npcs.VOID_SPINNER, 42, 52),
    VOID_SPINNER(arrayOf(Items.SPINNER_CHARM), Items.BLUE_CHARM, 74, 0.7, 59.6, Items.VOID_SPINNER_POUCH, 34, Npcs.VOID_SHIFTER, 42, 52),
    VOID_TORCHER(arrayOf(Items.TORCHER_CHARM), Items.BLUE_CHARM, 74, 0.7, 59.6, Items.VOID_TORCHER_POUCH, 34, Npcs.VOID_TORCHER, 42, 52),
    BRONZE_MINOTAUR(arrayOf(Items.BRONZE_BAR), Items.BLUE_CHARM, 102, 3.6, 316.8, Items.BRONZE_MINOTAUR_POUCH, 36, Npcs.BRONZE_MINOTAUR, 44, 72),
    BULL_ANT(arrayOf(Items.MARIGOLDS), Items.GOLD_CHARM, 11, 0.6, 52.8, Items.BULL_ANT_POUCH, 40, Npcs.BULL_ANT, 47, 8),
    MACAW(arrayOf(Items.CLEAN_GUAM), Items.GREEN_CHARM, 78, 0.8, 72.4, Items.MACAW_POUCH, 41, Npcs.MACAW, 48, 55),
    EVIL_TURNIP(arrayOf(Items.CARVED_EVIL_TURNIP), Items.CRIMSON_CHARM, 104, 2.1, 184.8, Items.EVIL_TURNIP_POUCH, 42, Npcs.EVIL_TURNIP, 49, 73),
    SPIRIT_COCKATRICE(arrayOf(Items.COCKATRICE_EGG), Items.GREEN_CHARM, 88, 0.9, 75.2, Items.SP_COCKATRICE_POUCH, 43, Npcs.SPIRIT_COCKATRICE, 50, 62),
    SPIRIT_GUTHATRICE(arrayOf(Items.GUTHATRICE_EGG), Items.GREEN_CHARM, 88, 0.9, 75.2, Items.SP_GUTHATRICE_POUCH, 43, Npcs.SPIRIT_GUTHATRICE, 50, 62),
    SPIRIT_SARATRICE(arrayOf(Items.SARATRICE_EGG), Items.GREEN_CHARM, 88, 0.9, 75.2, Items.SP_SARATRICE_POUCH, 43, Npcs.SPIRIT_SARATRICE, 50, 50),
    SPIRIT_ZAMATRICE(arrayOf(Items.ZAMATRICE_EGG), Items.GREEN_CHARM, 88, 0.9, 75.2, Items.SP_ZAMATRICE_POUCH, 43, Npcs.SPIRIT_ZAMATRICE, 50, 50),
    SPIRIT_PENGATRICE(arrayOf(Items.PENGATRICE_EGG), Items.GREEN_CHARM, 88, 0.9, 75.2, Items.SP_PENGATRICE_POUCH, 43, Npcs.SPIRIT_PENGATRICE, 50, 50),
    SPIRIT_CORAXATRICE(arrayOf(Items.CORAXATRICE_EGG), Items.GREEN_CHARM, 88, 0.9, 75.2, Items.SP_CORAXATRICE_POUCH, 43, Npcs.SPIRIT_CORAXATRICE, 50, 50),
    SPIRIT_VULATRICE(arrayOf(Items.VULATRICE_EGG), Items.GREEN_CHARM, 88, 0.9, 75.2, Items.SP_VULATRICE_POUCH, 43, Npcs.SPIRIT_VULATRICE, 50, 50),
    IRON_MINOTAUR(arrayOf(Items.IRON_BAR), Items.BLUE_CHARM, 125, 4.6, 404.8, Items.IRON_MINOTAUR_POUCH, 46, Npcs.IRON_MINOTAUR, 53, 88),
    PYRELORD(arrayOf(Items.TINDERBOX_590), Items.CRIMSON_CHARM, 111, 2.3, 202.4, Items.PYRELORD_POUCH, 46, Npcs.PYRELORD, 53, 78),
    MAGPIE(arrayOf(Items.GOLD_RING), Items.GREEN_CHARM, 88, 0.9, 83.2, Items.MAGPIE_POUCH, 47, Npcs.MAGPIE, 54, 62),
    BLOATED_LEECH(arrayOf(Items.RAW_BEEF), Items.CRIMSON_CHARM, 117, 2.4, 215.2, Items.BLOATED_LEECH_POUCH, 49, Npcs.BLOATED_LEECH, 56, 82),
    SPIRIT_TERRORBIRD(arrayOf(Items.RAW_BIRD_MEAT), Items.GOLD_CHARM, 12, 0.8, 68.4, Items.SPIRIT_TERRORBIRD_POUCH, 52, Npcs.SPIRIT_TERRORBIRD, 58, 9),
    ABYSSAL_PARASITE(arrayOf(Items.ABYSSAL_CHARM), Items.GREEN_CHARM, 106, 1.1, 94.8, Items.ABYSSAL_PARASITE_POUCH, 54, Npcs.ABYSSAL_PARASITE, 60, 75),
    SPIRIT_JELLY(arrayOf(Items.JUG_OF_WATER), Items.BLUE_CHARM, 151, 5.5, 484.0, Items.SPIRIT_JELLY_POUCH, 55, Npcs.SPIRIT_JELLY, 61, 106),
    IBIS(arrayOf(Items.HARPOON), Items.GREEN_CHARM, 109, 5.6, 98.8, Items.IBIS_POUCH, 56, Npcs.STEEL_MINOTAUR, 62, 77),
    STEEL_MINOTAUR(arrayOf(Items.STEEL_BAR), Items.BLUE_CHARM, 141, 1.1, 492.8, Items.STEEL_MINOTAUR_POUCH, 56, Npcs.IBIS, 62, 99),
    SPIRIT_GRAAHK(arrayOf(Items.GRAAHK_FUR), Items.BLUE_CHARM, 154, 5.7, 501.6, Items.SPIRIT_GRAAHK_POUCH, 57, Npcs.SPIRIT_GRAAHK, 63, 108),
    SPIRIT_KYATT(arrayOf(Items.KYATT_FUR), Items.BLUE_CHARM, 153, 5.7, 501.6, Items.SPIRIT_KYATT_POUCH, 57, Npcs.SPIRIT_KYATT, 63, 108),
    SPIRIT_LARUPIA(arrayOf(Items.LARUPIA_FUR), Items.BLUE_CHARM, 155, 5.7, 501.6, Items.SPIRIT_LARUPIA_POUCH, 57, Npcs.SPIRIT_LARUPIA, 63, 109),
    KARAMTHULHU_OVERLORD(arrayOf(Items.FISHBOWL), Items.BLUE_CHARM, 144, 5.8, 510.4, Items.KARAM_OVERLORD_POUCH, 58, Npcs.KARAMTHULHU_OVERLORD, 64, 101),
    SMOKE_DEVIL(arrayOf(Items.GOAT_HORN_DUST), Items.CRIMSON_CHARM, 141, 3.0, 268.0, Items.SMOKE_DEVIL_POUCH, 61, Npcs.SMOKE_DEVIL, 66, 99),
    ABYSSAL_LURKER(arrayOf(Items.ABYSSAL_CHARM), Items.GREEN_CHARM, 119, 1.9, 109.6, Items.ABYSSAL_LURKER_POUCH, 62, Npcs.ABYSSAL_LURKER, 67, 84),
    SPIRIT_COBRA(arrayOf(Items.SNAKE_HIDE), Items.CRIMSON_CHARM, 116, 3.1, 276.8, Items.SPIRIT_COBRA_POUCH, 63, Npcs.SPIRIT_COBRA, 68, 82),
    STRANGER_PLANT(arrayOf(Items.BAGGED_PLANT_1), Items.CRIMSON_CHARM, 128, 3.2, 281.6, Items.STRANGER_PLANT_POUCH, 64, Npcs.STRANGER_PLANT, 69, 90),
    BARKER_TOAD(arrayOf(Items.SWAMP_TOAD), Items.GOLD_CHARM, 10, 6.6, 87.0, Items.BARKER_TOAD_POUCH, 66, Npcs.MITHRIL_MINOTAUR, 71, 7),
    MITHRIL_MINOTAUR(arrayOf(Items.MITHRIL_BAR), Items.BLUE_CHARM, 152, 1.0, 580.8, Items.MITHRIL_MINOTAUR_POUCH, 66, Npcs.BARKER_TOAD, 71, 107),
    WAR_TORTOISE(arrayOf(Items.TORTOISE_SHELL), Items.GOLD_CHARM, 1, 0.7, 58.6, Items.WAR_TORTOISE_POUCH, 67, Npcs.WAR_TORTOISE, 72, 1),
    BUNYIP(arrayOf(Items.RAW_SHARK), Items.GREEN_CHARM, 110, 1.4, 119.2, Items.BUNYIP_POUCH, 68, Npcs.BUNYIP, 73, 77),
    FRUIT_BAT(arrayOf(Items.BANANA), Items.GREEN_CHARM, 130, 1.4, 121.2, Items.FRUIT_BAT_POUCH, 69, Npcs.FRUIT_BAT, 73, 91),
    RAVENOUS_LOCUST(arrayOf(Items.POT_OF_FLOUR), Items.CRIMSON_CHARM, 79, 1.5, 132.0, Items.RAVENOUS_LOCUST_POUCH, 70, Npcs.RAVENOUS_LOCUST, 74, 56),
    ARCTIC_BEAR(arrayOf(Items.POLAR_KEBBIT_FUR), Items.GOLD_CHARM, 14, 1.1, 93.2, Items.ARCTIC_BEAR_POUCH, 71, Npcs.ARCTIC_BEAR, 75, 10),
    PHOENIX(arrayOf(Items.POT_OF_FLOUR), Items.CRIMSON_CHARM, 165, 1.1, 301.0, Items.PHOENIX_POUCH, 72, Npcs.PHOENIX, 76, 121),
    OBSIDIAN_GOLEM(arrayOf(Items.OBSIDIAN_CHARM), Items.BLUE_CHARM, 195, 7.3, 642.4, Items.OBSIDIAN_GOLEM_POUCH, 73, Npcs.OBSIDIAN_GOLEM, 77, 137),
    GRANITE_LOBSTER(arrayOf(Items.GRANITE_500G), Items.CRIMSON_CHARM, 166, 3.7, 325.6, Items.GRANITE_LOBSTER_POUCH, 74, Npcs.GRANITE_LOBSTER, 78, 117),
    PRAYING_MANTIS(arrayOf(Items.RED_FLOWERS), Items.CRIMSON_CHARM, 168, 3.6, 329.6, Items.PRAYING_MANTIS_POUCH, 75, Npcs.PRAYING_MANTIS, 79, 118),
    FORGE_REGENT(arrayOf(Items.RUBY_HARVEST), Items.GREEN_CHARM, 141, 7.6, 134.0, Items.FORGE_REGENT_POUCH, 76, Npcs.ADAMANT_MINOTAUR, 80, 99),
    ADAMANT_MINOTAUR(arrayOf(Items.ADAMANT_BAR), Items.BLUE_CHARM, 144, 1.5, 668.8, Items.ADAMANT_MINOTAUR_POUCH, 76, Npcs.FORGE_REGENT, 80, 101),
    TALON_BEAST(arrayOf(Items.TALON_BEAST_CHARM), Items.CRIMSON_CHARM, 174, 3.8, 1015.2, Items.TALON_BEAST_POUCH, 77, Npcs.TALON_BEAST, 81, 122),
    GIANT_ENT(arrayOf(Items.WILLOW_BRANCH), Items.GREEN_CHARM, 124, 1.6, 136.8, Items.GIANT_ENT_POUCH, 78, Npcs.GIANT_ENT, 82, 87),
    FIRE_TITAN(arrayOf(Items.FIRE_TALISMAN), Items.BLUE_CHARM, 198, 7.9, 695.2, Items.FIRE_TITAN_POUCH, 79, Npcs.FIRE_TITAN, 83, 139),
    ICE_TITAN(arrayOf(Items.AIR_TALISMAN, Items.WATER_TALISMAN), Items.BLUE_CHARM, 198, 7.9, 695.2, Items.ICE_TITAN_POUCH, 79, Npcs.ICE_TITAN, 83, 139),
    MOSS_TITAN(arrayOf(Items.EARTH_TALISMAN), Items.BLUE_CHARM, 202, 7.9, 695.2, Items.MOSS_TITAN_POUCH, 79, Npcs.MOSS_TITAN, 83, 142),
    HYDRA(arrayOf(Items.WATER_ORB), Items.GREEN_CHARM, 128, 1.6, 140.8, Items.HYDRA_POUCH, 80, Npcs.HYDRA, 84, 90),
    SPIRIT_DAGANNOTH(arrayOf(Items.DAGANNOTH_HIDE), Items.CRIMSON_CHARM, 1, 4.1, 364.8, Items.SPIRIT_DAGANNOTH_POUCH, 83, Npcs.SPIRIT_DAGANNOTH, 85, 1),
    LAVA_TITAN(arrayOf(Items.OBSIDIAN_CHARM), Items.BLUE_CHARM, 219, 8.3, 730.4, Items.LAVA_TITAN_POUCH, 83, Npcs.LAVA_TITAN, 85, 154),
    SWAMP_TITAN(arrayOf(Items.SWAMP_LIZARD), Items.CRIMSON_CHARM, 150, 4.2, 373.6, Items.SWAMP_TITAN_POUCH, 85, Npcs.SWAMP_TITAN, 87, 105),
    RUNE_MINOTAUR(arrayOf(Items.RUNE_BAR), Items.BLUE_CHARM, 1, 8.6, 756.8, Items.RUNE_MINOTAUR_POUCH, 86, Npcs.RUNE_MINOTAUR, 89, 1),
    UNICORN_STALLION(arrayOf(Items.UNICORN_HORN), Items.GREEN_CHARM, 140, 1.8, 154.4, Items.UNICORN_STALLION_POUCH, 88, Npcs.UNICORN_STALLION, 91, 98),
    GEYSER_TITAN(arrayOf(Items.WATER_TALISMAN), Items.BLUE_CHARM, 222, 8.9, 783.2, Items.GEYSER_TITAN_POUCH, 89, Npcs.GEYSER_TITAN, 92, 156),
    WOLPERTINGER(arrayOf(Items.RAW_RABBIT, Items.WOLF_BONES), Items.CRIMSON_CHARM, 203, 4.5, 404.8, Items.WOLPERTINGER_POUCH, 92, Npcs.WOLPERTINGER, 93, 143),
    ABYSSAL_TITAN(arrayOf(Items.ABYSSAL_CHARM), Items.GREEN_CHARM, 112, 1.9, 163.2, Items.ABYSSAL_TITAN_POUCH, 93, Npcs.ABYSSAL_TITAN, 94, 79),
    IRON_TITAN(arrayOf(Items.IRON_PLATEBODY), Items.CRIMSON_CHARM, 198, 4.7, 417.6, Items.IRON_TITAN_POUCH, 95, Npcs.IRON_TITAN, 96, 139),
    PACK_YAK(arrayOf(Items.YAKHIDE), Items.CRIMSON_CHARM, 211, 4.8, 422.4, Items.PACK_YAK_POUCH, 96, Npcs.PACK_YAK, 97, 148),
    STEEL_TITAN(arrayOf(Items.STEEL_PLATEBODY), Items.CRIMSON_CHARM, 178, 4.9, 435.2, Items.STEEL_TITAN_POUCH, 99, Npcs.STEEL_TITAN, 99, 125)

    companion object {
        val values = enumValues<SummoningPouchData>()
    }
}