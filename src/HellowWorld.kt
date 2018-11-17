fun main(args: Array<String>) { // Program execution starts from here; as in Java it starts from "public static void main(String[] args){}"

    /**
     *   " ; " is optional in kotlin.
     *   println() will print a line with \n and goes to next line.*/
    println("Hello World!")
    println("This is my first Kotlin program.")

    /* Variable declaration and assignment: */
   // var suman:String = "Suman Shekhar Dora" // Explicit type specification can be removed .

    var suman = "Suman Shekhar Dora"
    println("Hi ! "+suman)
    println("I Can print \$suman with out interpolation and with interpolation as: $suman")
    var x:Int //declaration
    x=50; //assignment

    /**
     *  String concatenation
     *  1. String + number is possible.
     *  2. number + String concatenation is not possible.
     *  so add a " "+number+"String here"
     *  or
     *  "$variableName StringValue here"
     *  */

    println("Value of x1 is: "+x) //concatenation
    x=60
    println("Value of x2 is: $x") // template or String interpolation

    // variable name starts with letter and can contain number, letter and $.
    // It should be in camelcase form and start with small letter.
    val monthlySalary:Double = 12500.00
    var salaryPerAnum:Double = monthlySalary * 12;

    println("Monthly Salary: $monthlySalary")
    println("Salary per year: $salaryPerAnum")
    println()
    println("$$monthlySalary per month will be $${monthlySalary*12} per year") // Differentiating between a interpolation and $ symbol as a string.

    println()

    // Variable declared with "val" are immutable. Where as variables declared with "var" are mutable.
    val apple:Int = 24567
    val orange:Int =56778

    /* Basic Operations: */
    var fruit:Int = apple+orange
    println("Addition: $fruit")
    println()

    println("Subtraction: ${orange-apple}")
    println()
    println("Division: ${orange/apple}")
    println()
    println("Multiplication: ${orange*apple}")
    println()
    println("Modulo: ${orange%apple}")
    println()






}