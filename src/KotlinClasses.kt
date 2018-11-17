//When you add parameters that have default values, they must be listed after any parameters that don't.
// So playerName must be the 1st parameter that's declared in the KotlinClasses and that's why level,lives and scores are added after it.
class KotlinClasses(val playerName:String, var level:Int=1, var lives:Int=3, var score:Int =0) {//we can make the call constructor parameterised from here

    //Weapon object:
    var weapon:Weapon = Weapon("Gun",30)

//    var lives=3
//    var level=1
//    var score =0

    /* Writing a function - show()*/

    fun show(){
        ///""" is used to print multiple lines of text.
        println("""
            name: $playerName
            lives: $lives
            level: $level
            score: $score
            Weapon: ${weapon.name}
            DamageInflicted: ${weapon.damageInflicted}
        """.trimIndent())// It removes extra spaces
    }
}