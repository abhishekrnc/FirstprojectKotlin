fun main() {
    val mustang = Car("mustang", "petrol",  100)            //Creating Objects
    val beetle = Car( "beetle",  "diesel",  200)

    println(mustang.name)               //calling the properties
    println(mustang.type)

    println(beetle.name)


    mustang.driveCar()

}

class Car (val name : String, val type : String, var kmRan : Int)                  //Class declaration in Kotlin   //Properties
{
    fun driveCar()
    {                                //Method declaration in Kotlin
        println("Car is driving")
    }

    fun applyBrakes()
    {
        println("Applied Brakes")
    }
}