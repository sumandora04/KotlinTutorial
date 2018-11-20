import java.util.*

class VampireKing(name: String) : Vampire(name) {

    // init{} helps in changing the values of different properties in the superclass.
    init {
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2) // dividing the hitPoint by 4 (2 here and 2 in Vampire class.
    }

    fun runAway():Boolean{
        return lives<2 // true if lives are less than 2
    }

    fun dodges():Boolean{
        val rand = Random()
        val chances = rand.nextInt(6)

        if (chances>3){
            println("Dracula dodges...")
            return true
        }
        return false

    }
}