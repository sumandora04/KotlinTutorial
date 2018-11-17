fun main(args:Array<String>){
    //If no value is given for a property then it will take the default value set in the constructor and it wont produce any error.
    val playerDetails = KotlinClasses("Suman") // Creating a new instance of the player class

    //Accessing various properties of the player

//    println(playerDetails.playerName)
//    println(playerDetails.lives)
//    println(playerDetails.level)
//    println(playerDetails.score)

    //OR
    playerDetails.show()
    println()


    //Single constructor and multiple implementations:
    val pooja = KotlinClasses("Pooja")
//    assigning new values to the properties of the class.
    pooja.level=3
    pooja.lives=5
    pooja.score=101
    pooja.show()
    println()

    val anjali = KotlinClasses("Anjali",4,3)
    val weapon1 = Weapon("Granade",60)
    val weapon2 = Weapon("Sword",30)
    anjali.weapon=weapon1
    anjali.show() // Printing all details using the show() including weapon
    println()

    val shekhar = KotlinClasses("Shekhar",3,3,123)


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
    shekhar.weapon=anjali.weapon // Assigning anjali's weapon to shekhar, before anjali can get the weapon2.
    shekhar.show()
    println()

    anjali.weapon=weapon2
    anjali.show()
}