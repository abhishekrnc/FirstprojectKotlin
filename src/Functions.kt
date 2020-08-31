fun main() {
    val result = add(4, 5)   //Function calling and this is the second step
    println (result)
    val result2 = add(5, 10)
    println(result2)
    evenOrOdd(12)             //Function call
    evenOrOdd(13)
}

fun add(num1 : Int, num2 : Int): Int
{                                                   //This is the first step and here we have defined the function
    val sum = num1 + num2
    return sum
}

fun evenOrOdd(num1 : Int) {
    val result = if (num1 % 2 == 0) "Even" else "odd"          //function define ( here the function name is evenOrOdd
    println(result)
}