fun main(args: Array<String>) {
    // Index starts from 0 (zero).
//    for (i in /*1..20*/ 1 until 20) {// 1..20 --> it will include 1 and 20.
//        // 1 until 20 --> it will exclude 20.
//        if (i == 11) {
//            continue // it will skip the iteration at 11 and will go to 12.
//        } /*else if (i == 19) {
//            break // It will stop the iteration at 19 and get out of the loop.
//        }*/ else {
//            println("$i squared is ${i * i}")
//        }
//
//    }

    // printing for loop in reverse order:
    println()
    println("Reverse order: ")
    for (i in 10 downTo 1) { // downTo --> for printing data in reverse order. both values will be included.
        println("$i squared is ${i * i}")
    }
    println()

    println()
    println("Reverse order using step: ")
    for (i in 10 downTo 0 step 2) { // step --> It will create a pattern. here every 2nd item will be printed as the step value is 2.
        println("$i squared is ${i * i}")
    }
    println()


    // Printing numbers between 1 to 100; which are divisible by both 3 and 5 :
    print("Numbers between 1 to 100, which are divisible by both 3 and 5 are:")

    //It is inefficient as it will check for each and every number:
    /*for (i in 1..100){
        if (i % 3 == 0 && i % 5 == 0){
            print("\t $i")
        }
    }*/

    //OR

    // It is more efficient; because it will test for 20 values
    /*for (value in 5..100 step 5){
        if (value % 3==0){
            print("\t $value")
        }
    }*/

    //OR

    // It is 2nd in efficiency; because it will test for 33 values
    for (value in 3..100 step 3) {
        if (value % 5 == 0) {
            print("\t $value")
        }
    }
}