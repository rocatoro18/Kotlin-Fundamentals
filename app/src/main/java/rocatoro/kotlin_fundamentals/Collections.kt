package rocatoro.kotlin_fundamentals

fun main(){

    // More descriptive
    // val numbers: IntArray = intArrayOf(1,2,3,4,5,6,7,8)
    // Type inference
    //val numbers = intArrayOf(1,2,3,4,5,6,7,8)
    // Less descriptive
    val numbers = arrayOf(1,2,3,4,5,6,7,8)
    val numbersD : DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0,6.0)
    //println(numbers.contentToString())

    for(element in numbers){
        println("${element+2}")
    }
    println("----------------")
    for(element in numbers){
        println(element)
    }
    println("----------------")
    numbers[0] = 18
    numbersD[4] = 18.0
    println(numbers.contentToString())
    println(numbersD.contentToString())

    val days = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")

    println(days.contentToString())

    val fruits = arrayOf(Fruit("Apple",2.0), Fruit("Banana",1.25))
    println(fruits.contentToString())

    // Get only fruits & prices
    for (fruit in fruits){
        println("Fruit: ${fruit.name}, Price: ${fruit.price}")
    }

    // Get fruits, prices & indexes
    for (index in fruits.indices){
        println("${fruits[index].name} is in index $index")
    }

    val mix = arrayOf(1,2,3,"Monday",18.0,"November",Fruit("Orange",4.0))
    println(mix.contentToString())

}

    data class Fruit(val name: String, val price: Double)