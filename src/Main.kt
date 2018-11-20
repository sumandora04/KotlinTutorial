fun main(args: Array<String>) {
    //If no value is given for a property then it will take the default value set in the constructor and it wont produce any error.
    val playerDetails = PlayersClass("Suman") // Creating a new instance of the player class

    //Accessing various properties of the player

//    println(playerDetails.playerName)
//    println(playerDetails.lives)
//    println(playerDetails.level)
//    println(playerDetails.score)

    //OR
    playerDetails.show()
    println()


    //Single constructor and multiple implementations:
    val pooja = PlayersClass("Pooja")
//    assigning new values to the properties of the class.
    pooja.level = 3
    pooja.lives = 5
    pooja.score = 101
    pooja.show()
    println()

    val anjali = PlayersClass("Anjali", 4, 3)
    val weapon1 = Weapon("Granade", 60)
    val weapon2 = Weapon("Sword", 30)
    anjali.weapon = weapon1
    anjali.show() // Printing all details using the show() including weapon
    println()

    val shekhar = PlayersClass("Shekhar", 3, 3, 123)


    //Separately showing the weapon details
//    println(shekhar.weapon.name.toUpperCase())
//    println(shekhar.weapon.damageInflicted)
    println()


//    val axe = Weapon("Axe",10)
//    shekhar.weapon=axe
//    println(sum.weapon.name)
//    println(axe.name)
//    println(axe.damageInflicted)

//    axe.damageInflicted=15
//    println(sum.weapon.damageInflicted)
//
//    sum.weapon = Weapon("Sword",35)
//    println(sum.weapon.name)
//
//    sum.weapon =Weapon("Spear", 40)
//    println(sum.weapon.name)

//    shekhar.show() // Printing all details using the show() including weapon
    shekhar.weapon = anjali.weapon // Assigning anjali's weapon to shekhar, before anjali can get the weapon2.
    shekhar.show()
    println()

    anjali.weapon = weapon2
    anjali.show()
    println(anjali)

//    anjali.inventory.add(Loot("+2 Invisibility potion",LootType.POTION,15.45))
//    anjali.inventory.add(Loot("+2 Chest armour",LootType.ARMOUR,80.00))

    anjali.getLoot(Loot("+2 Chest armour",LootType.ARMOUR,80.00)) // As the inventory property is encapsulated so we cant access it directly.
    anjali.getLoot(Loot("+2 Invisibility potion",LootType.POTION,15.45))
    anjali.showInventory()

    println()

    println(shekhar)
    val redPotion = Loot("Red Potion", LootType.POTION, 10.5)
//    shekhar.inventory.add(redPotion)
    shekhar.getLoot(redPotion)

    //Directly adding items to an arraylist:
//    shekhar.inventory.add(Loot("+3 Chest armour",LootType.ARMOUR,80.00))
//    shekhar.inventory.add(Loot("Invisibility potion",LootType.POTION, 15.45))
    shekhar.getLoot(Loot("Invisibility potion",LootType.POTION, 15.45)) // no references for these items, so they cant be removed.
    shekhar.getLoot(Loot("+3 Chest armour",LootType.ARMOUR,80.00))
    shekhar.showInventory()

    //removing item from inventory:
    if (shekhar.dropLoot(redPotion)){
        shekhar.showInventory()
    }else{
        println("${redPotion.name} is not available in your inventory.")
    }


    //When there is no such item and we try to remove it from the inventory.
    val bluePotion = Loot("Blue Potion",LootType.POTION,15.80)
    if (shekhar.dropLoot(bluePotion)){
        shekhar.showInventory()
    }else{
        println("${bluePotion.name} is not available in your inventory.")
    }


    //Using the overloaded dropLoot() function:
    shekhar.dropLoot("Invisibility potion")
    shekhar.showInventory()
}