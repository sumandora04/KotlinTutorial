fun main(args: Array<String>) {
//    val enemy = Enemy("Test Enemy",10,3)
//    println(enemy)
//    println()
//
//    enemy.takeDamage(6)
//    println(enemy)
//    println()
//
//    enemy.takeDamage(12)
//    println(enemy)
//    println()

//    val uglyTroll = Troll("Ugly Troll",27,2)
    val uglyTroll = Troll("Ugly Troll")
    println(uglyTroll)// Troll is inheriting the Enemy class and using the toString() function to print the details.
    println()

    uglyTroll.takeDamage(30)
    println(uglyTroll)
    println()

    val bloodSucker = Vampire("BloodyVamp")
    println(bloodSucker)
    println()

    bloodSucker.takeDamage(34)
    println()
    bloodSucker.takeDamage(7)
    println()
    println(bloodSucker)
    println()

    bloodSucker.takeDamage(30)
    println()
    println(bloodSucker)
    println()


    val dracula = VampireKing("Dracula")
    println(dracula)

    //Use for loop and go to battle 5 times
 /*   for (battle in 1..5) {
        val dracula = VampireKing("Dracula")
        println(dracula)
        //Kill the dracula using while loop:
        while (dracula.lives > 0) {
            if (dracula.dodges()) {
                continue
            }
            if (dracula.runAway()) {
                println("Dracula ran away...")
                break
            } else {
                dracula.takeDamage(80)
            }
        }
        println("===========================================")
    }
*/

    dracula.lives=0

    do {
        if (dracula.dodges()) {
            dracula.lives+=1
            continue
        }
        if (dracula.runAway()) {
            println("Dracula ran away...")
            break
        } else {
            dracula.takeDamage(80)
        }
    }  while (dracula.lives > 0)
//    println(dracula)
}