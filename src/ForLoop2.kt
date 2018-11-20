fun main(args:Array<String>){
    val conan = PlayersClass("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOUR, 183.0))
    conan.getLoot(Loot("Ring of speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Red potion", LootType.POTION, 2.0))
//    conan.getLoot(Loot("Cursed shield", LootType.ARMOUR, -8.0))
    conan.getLoot(Loot("Brass Ring", LootType.RING, 1.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOUR, 4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION, 3.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))

    conan.showInventory()
}