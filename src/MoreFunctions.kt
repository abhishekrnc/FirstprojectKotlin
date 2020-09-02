fun main() {
   // println(addition(1,3))
   // println(addition(1.0, 3.0))
   // println(addition(a = 2, b = 6))         //Named Argument concept in Kotlin

    var fn = ::addition                  //Storing value in varible
    println(fn(1.4, 5.6))
}

//fun addition(a : Int, b: Int): Int
//{
//    return a + b
//}

fun addition(a : Double, b: Double): Double
{
    return a + b
}

