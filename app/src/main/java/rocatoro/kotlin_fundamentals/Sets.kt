package rocatoro.kotlin_fundamentals

fun main(){
    // Only show unique items
    val fruits = setOf("Orange","Apple","Grape","Apple","Orange","Mango")
    println(fruits.size)
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    println(newFruits)
    println(newFruits.elementAt(5))

    // Map is a type of collection that holds data in the form of a key value par
    val dayOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    println(dayOfTheWeek)

    for (key in dayOfTheWeek.keys){
        println("$key is to ${dayOfTheWeek[key]}")
    }

    val fruitsMap = mapOf("Favorite" to Fruit1("Grape",2.0),
        "OK" to Fruit1("Apple",1.0))
    println(fruitsMap)

    val newDayOfWeek = dayOfTheWeek.toMutableMap()
    newDayOfWeek[4] = "Thursday"
    newDayOfWeek[5] = "Friday"
    newDayOfWeek[5] = "Saturday"
    println(newDayOfWeek.toSortedMap())
}

data class Fruit1(val name: String,val price: Double)