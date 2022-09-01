package rocatoro.kotlin_fundamentals

fun main(){

    // Immutable list, we cannot add a new item to them
    val months = listOf("January","February","March")
    val anyType = listOf("Hello",3,5.0,true)
    println(anyType.size)
    println(months[1])
    println("-----------")
    for (month in months){
        println(month)
    }
    println("----------")
    // Mutable list, we can add a new item to them
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April","May","June")

    additionalMonths.addAll(newMonths)
    additionalMonths.add("July")
    additionalMonths.add("August")
    println(additionalMonths)
    println("-----------")
    val days = mutableListOf<String>("Monday","Tuesday","Wednesday")
    println(days)
    days.add("Thursday")
    days[1] = "Sunday"
    days.removeAt(1)
    val removeList = mutableListOf<String>("Monday")
    days.removeAll(removeList)
    days.removeAll(days)
    
    println(days)
}