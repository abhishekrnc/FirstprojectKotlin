fun main() {
    val result = add(4, 5)   //Function calling and this is the second step
    println (result)
    val result2 = add(5, 10)
    println(result2)
    evenOrOdd(12)             //Function call
    evenOrOdd(13)
    val result3 = add1 (10, 30)    //The calue that we pass during  the function call is called as Argument
    println(result3)

    printMessage(4)    //Function calling
}

fun add(num1 : Int, num2 : Int): Int
{                                                   //This is the first step and here we have defined the function
    val sum = num1 + num2                           //Other way to define Function in Kotlin is given below
    return sum
}

fun evenOrOdd(num1 : Int)
{
    val result = if (num1 % 2 == 0) "Even" else "odd"          //function define ( here the function name is evenOrOdd
    println(result)
}


//The other way of defining a function in Kotlin

fun add1(num1 : Int, num2 : Int): Int = num1 + num2



fun printMessage(count: Int) {             //The value which we pass in the function is called as argument                 //Function Define with for loop and range
    for (i in 1..count) {
        println("Hello $i")
    }
}


fun abhishek(dog : String, cat : String) {
    val result = "Cat" ; "Dog"
}