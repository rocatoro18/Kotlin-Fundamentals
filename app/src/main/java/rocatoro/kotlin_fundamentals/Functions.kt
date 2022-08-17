package rocatoro.kotlin_fundamentals

fun main(){
    myFunction()
    // Argument
    var result = addUp(2,3)
    println("$result")

    var average = average(4.0,2.0)
    println("$average")

}

// Method - is a function within a class
// Parameter (input)
fun addUp(x: Int, y: Int ): Int{
    // output
    return x + y
}

fun average(x: Double, y: Double): Double{
    return (x + y) / 2
}

fun myFunction(){
    println("Called from myFunction")
}