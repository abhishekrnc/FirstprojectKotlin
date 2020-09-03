fun main() {
    val mustang = Car("mustang", "petrol",  100)            //Creating Objects
    val beetle = Car( "beetle",  "diesel",  200)

    println(mustang.name)               //calling the properties
    println(mustang.type)

    println(beetle.name)


    mustang.driveCar()                         //calling the Methods
    beetle.driveCar()

}

class Car (val name : String, val type : String, var kmRan : Int)                  //Class declaration in Kotlin   //Properties
{
    fun driveCar()
    {                                //Method declaration in Kotlin
        println("$name Car is driving")                      //$name is for printing the name
    }

    fun applyBrakes()
    {
        println("Applied Brakes")
    }
}