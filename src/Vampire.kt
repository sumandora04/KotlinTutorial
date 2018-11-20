

open class Vampire(name:String):Enemy(name,20,3) {

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage/2) // Vampire is taking half of the actual damage.
    }
}