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

    val poo = KotlinClasses("Anjali",4,3)
    poo.show()
    println()

    val sum = KotlinClasses("Shekhar",3,3,123)
    sum.show()
    println()
}