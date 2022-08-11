package rocatoro.kotlin_fundamentals

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
    print("Hello " + myName)

    // Integer Types: Byte (8 bit), Short (16 bit),
    // Int (32 bit), Long (64 bit)
    val myByte: Byte = 18
    val myShort: Short = 124
    val myInt: Int = 1234553
    val myLong: Long = 122342345324876

    // Floating point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 18.11f
    val myDouble: Double = 3.14178582342

}
