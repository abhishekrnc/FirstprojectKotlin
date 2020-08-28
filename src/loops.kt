fun main() {
    //While Loop (First condition is checked and then the program is executed)

    //var count = 5
    //while (count >= 1)
    //{
    //    println("Hello Welcome to Kotlin Tuotrial")
     //       count--
   // }


//    var number = 2
//    var index = 1
//    while (index <= 10)
//    {
//        println(number * index)
//        index++
//    }
//    println("Outside Loop - " + index)   //this line is written to check the last index value from which the looping will end

    //Do while loop (first the program is executed and then the condition is checked)

//   var index = 5
////    do{
////        println("Hello Kotlin")
////    } while(index>5)
//////////////////////////////////////////////
//    do{
//        println("Hello Kotlin")
//        index++
//    }while(index>5)


    //For Loop

    for(i in 1..5 ) {
        println(i)
    }

    for(i in 1..5 step 2) {    //step 2 we write for stepping like 1, 3, 5, 7
        println(i)
    }

}