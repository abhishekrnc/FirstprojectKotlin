fun main() {
    var arr = arrayOf("One", "Two", "Three")
    var arr1 = arrayOf(1,2,3)                           //Implicit declaration of Array Datatype


    var arr2 = arrayOf<Int>(3,4,5)    //Explicit declaration of Array

//    for(i in arr) {             //without Index Number
//        println(i)

    for((i, e) in arr .withIndex()) {     //Array printing with their Index Number
        println("$i - $e")
    }

    println(arr[0])            //for printing the value of the particular position of array
    println(arr.get(1))
    arr.set(0, "Hello")   //reasiging the value of the Index
    println(arr[0])
    println(arr.size)     //for size fetching
    println(arr[2])

}