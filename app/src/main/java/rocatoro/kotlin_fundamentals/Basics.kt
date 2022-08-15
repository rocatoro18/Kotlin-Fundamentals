package rocatoro.kotlin_fundamentals

import kotlin.math.min

fun main(){
    // var can be overriden
    // val can not be overrriden, can only be set once (cannot be reassigned)
    // immutable variable
    // TODO: Add new functionality
    /*
    This is
    a multiline
    comment
     */
    // type string
    var myName = "Carlos"
    myName = "Roberto"
    val name = "Roberto"
    // type int
    var myAge = 22
    println("Hello " + myName)

    // Integer Types: Byte (8 bit), Short (16 bit),
    // Int (32 bit), Long (64 bit)
    val myByte: Byte = 18
    val myShort: Short = 124
    val myInt: Int = 1234553
    val myLong: Long = 122342345324876

    // Floating point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 18.11f
    val myDouble: Double = 3.14178582342

    // Booleans are used to represent logical values
    // It can have two possible values (true/false)
    var isSunny: Boolean = true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    var myNamee = "Carlos"
    var firstCharacter = myNamee[0]
    var lastCharacter = myNamee[myNamee.length-1]

    println("First character $firstCharacter, and the lenght of the str is ${myNamee.length}")

    println("Last character $lastCharacter")

    // Aritmetic operators (+,-,*,/,%)
    var result = 10 + 8
    //result /= 2
    //result *= 2
    //result -= 2
    //result %= 2
    var a = 8.0
    var b = 2
    var resultDouble: Double
    resultDouble = a / b

    println(resultDouble)

    // Comparison operators (==, < ,> , <=, >=, !=)

    val isEqual = 5 == 3
    val isNotEqual = 5 != 5

    println("Is equal $isNotEqual")
    // String interpolation
    println("Is 10 greater than 5 ${5>3}")

    // Assignment operator (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 5
    println("My num is $myNum")
    myNum -= 4
    println("My num is $myNum")
    // Increment & decrement operators (++, --)
    myNum++
    println("My num is $myNum")
    // Inside string interpolation plus plus increment depends of the position of plus plus symbols
    // Before
    println("My num is ${++myNum}")
    // After
    println("My num is ${myNum++}")
    println(myNum)

    // If Statements
    var heightPerson1 = 180
    var heightPerson2 = 180

    if(heightPerson1 > heightPerson2){
        println("Person 1 is more higher than person 2")
    }else if(heightPerson1 == heightPerson2){
        println("Person 2 has the same height than person 1")
    }
    else{
        println("Person 2 is more higher than person 1")
    }

    println("---------------------")

    var age = 22

    if( age >= 60)
        println("You're over 60")

    if (age >= 21){
        println("You may drink")
    } else if (age >= 18){
        println("You may vote")
    } else if (age >= 16){
        println("You may drive")
    } else {
        println("You're too young")
    }

    var Name = "Carlos"

    if (Name == "Carlos"){
        println("Welcome Home Carlos")
    } else{
        println("Who are you?")
    }

    val isRainy = true
    if(isRainy)
        println("It's rainy")

    println("-------------")

    // Kotlin’s "when" expression is the replacement of the switch statement
    // from other languages like C, C++, and Java.
    // It is compact and more powerful than switch statements.

    var season = 3

    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid season")
    }

    var month = 4

    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        //in 12..2 -> println("Autumn")
        //in 12 downTo 2 -> println("Autumn")
        12, 1, 2 -> println("Autumn")
        else -> println("Invalid month")
    }

    when(age){
        //in 21..200 -> println("now you may drink in the us")
        !in 0..20 -> println("now you may drink in the us")
        in 18..20 -> println("you may vote now")
        16, 17 -> println("you may drive now")
        else -> println("You're too young")
    }

    var x : Any = 13.37f

    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    val xy : Any = 13.37
    //assign when to a variable
    val resultado =  when(x) {
    //let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
    //then print x with the result
    println("$xy $resultado")

    println("-----------------")

    // while loop executes a block of code repeatedly as long as you given condition is true
    var q = 1
    while(q <= 10){
        println("$q")
        q++
    }
    println("\n while loop is done")

    var z = 100
    while (z >= 0){
        println("$z")
        z -= 2
    }

    println("---------dowhile------------")
    var y = 1

    do{
        println("$y")
        y++
    }while(y <= 10)
    println("do while loop is done")
}
