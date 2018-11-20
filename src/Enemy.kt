
// To make a class inheritable use "open" as prefix. By default a class can not be inherited in kotlin.
open class Enemy(val name:String, var hitPoints:Int, var lives:Int) {


    open fun takeDamage(damage:Int){
        val remainingHitPoints = hitPoints-damage
        if (remainingHitPoints>0){
            hitPoints = remainingHitPoints
            println("$name took $damage points of damage and has $hitPoints left")
        }else{
            lives-=1
            if (lives>0){
                println("$name lost a life.")
            }else{
                println("No lives left, $name is dead.")
            }
        }
    }

    override fun toString(): String {
        return "name='$name', hitPoints=$hitPoints, lives=$lives"
    }


}