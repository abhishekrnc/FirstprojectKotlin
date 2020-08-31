fun main() {
    val result = add(4, 5)   //Function calling and this is the second step
    println (result)
    val result2 = add(5, 10)

}

fun add(num1 : Int, num2 : Int): Int
{                                                   //This is the first step and here we have defined the function
    val sum = num1 + num2
    return sum
}