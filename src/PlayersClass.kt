//When you add parameters that have default values, they must be listed after any parameters that don't.
// So playerName must be the 1st parameter that's declared in the PlayersClass and that's why level,lives and scores are added after it.
class PlayersClass(val playerName: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {//we can make the call constructor parameterised from here

    //Weapon object:
    var weapon: Weapon = Weapon("Gun", 30)

//    var lives=3
//    var level=1
//    var score =0

    /* Writing a function - show()*/


    private val inventory = ArrayList<Loot>()

    // Getter method to access the private properties-- here inventory.
    fun getLoot(item: Loot) {
        inventory.add(item)
        // if we wants to save the inventory details of the player and later back it up when player comes back to play the game.
        // Code to save inventory details goes here.

    }

    //Dropping an item if it is there in the inventory:
    fun dropLoot(item: Loot): Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    /* Overloading the dropLoot() function: */
    /*fun dropLoot(itemName: String): Boolean {
        println("$itemName will be dropped.")
        return inventory.removeIf { it.name == itemName } // removeIf{} will check the condition and remove the item-- inbuilt function.
        // it.name --> current item in the inventory;
        // itemName --> value passed to the function;
    }*/

    fun dropLoot(itemName: String): Boolean {
        println("$itemName will be dropped.")
        var result=false
        for (item in inventory){
            if (item.name == itemName){
                inventory.remove(item)
                result=true
                break
            }
        }

        if (!result){
            println("No such Item $itemName found in inventory.")
        }
        return result
    }

    /* fun show(){
         ///""" is used to print multiple lines of text.
         println("""
             name: $playerName
             lives: $lives
             level: $level
             score: $score
             Weapon: ${weapon.name}
             DamageInflicted: ${weapon.damageInflicted}
         """.trimIndent())// It removes extra spaces
     }*/


    fun show() {
        if (lives > 0) {
            println("$playerName is alive.")
        } else {
            println("$playerName is dead. ")
        }
    }


    override fun toString(): String {
        return """
            name: $playerName
            lives: $lives
            level: $level
            score: $score
            $weapon
        """.trimIndent()
    }


    fun showInventory() {
        println()
        var total =0.0
        println("$playerName's Inventory:")
        // For-each loop:
        for (item in inventory) {
            println(item)
            total+=item.value
        }
        // println(inventory.get(0))
        println("=========================")
        println("Total score is: $total ")
        println("=========================")
    }
}


/**
 * By default the properties of a class is public and that is why our main() function can access the properties of other classes.
 * Encapsulation is the process in which, the inner working of a class is kept hidden from other classes.
 * To encapsulate a property we need to declare the property as private.
 * */