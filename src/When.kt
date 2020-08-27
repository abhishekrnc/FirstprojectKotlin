fun main() {
    val animal = "Dog"
//    if(animal == "Horse") {
//        println("Animal is Horse")
//    }
//    else if (animal == "cat"){
//        println("Animal is Cat")
//    }
//    else if(animal == "dog") {
//        println("Animqal is Dog")
//    }
//    else {
//        println("Animal is Dog")
//    }

/////////////The Above one ius just for reference

    when(animal) {
        "Horse" -> println("Animal is Horse")
        "Cat" -> println("Animal is Cat")
        "Dog" -> println("Animal is Dog")
        else -> println("Animal not found")
    }


    //when as an Expression

    val anim = "Pussy"
    val result = when(anim) {
        "Horse" -> "Animal is Horse"
        "Cat" -> "Animal is Cat"
        "Dog" -> "Animal is Dog"
        else -> "Animal not found"
    }

    println(result)
}