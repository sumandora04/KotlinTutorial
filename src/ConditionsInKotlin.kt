fun main(args: Array<String>){
//    val lives = 0 // constant value.
//
//    var isGameOver = (lives<1)
//    println(isGameOver)
//
//    if(isGameOver){
//        print("Game over")
//    }else{
//        println("You are still alive !")
//    }

    // Taking user input:
    println("How old are you?")
    val age:Int = readLine()!!.toInt()
    println("Your age is $age years")

    val messaage:String

    //Style:1
   /* if (age<18){
        messaage="Your too young to vote."
    }else if (age>=100){
        messaage = "Congratulation..."
    }else{
        messaage = "You can vote."
    }*/

    //Style:2
   /* messaage = if (age<18){
        "Your too young to vote."
    }else if (age>=100){
        "Congratulation..."
    }else{
        "You can vote."
    }*/

    //Style:3 -- Use of when in place of nested if-else -- it is used when there is more than 2 if-else statements
    messaage = when {
        age<18 -> "Your too young to vote."
        age>=100 -> "Congratulation..."
        else -> "You can vote."
    }

    print(messaage)

}