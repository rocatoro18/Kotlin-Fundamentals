package rocatoro.kotlin_fundamentals

fun main(){

    var name: String = "Roberto"
    // name = NULL -> Compilation ERROR
    name = "Carlos"
    var nullableName: String? = "Roberto"
    nullableName = null

    var len = name.length

    /* OLD VERSION OF NULLABLES
    if(nullableName != null){
        var len2 = nullableName.length
    }else{
        null
    }
    */
    // NEW VERSION OF NULLABLES
    // Safe call operator
    var len2 = nullableName?.length
    //nullableName?.let { println(it.length) }
    println("len $len")
    println("len2 $len2")
    //println(nullableName?.toLowerCase())

    // ELVIS OPERATOR ?:
    val namee = nullableName ?: "Guest"
    println("namee is $namee")

    // NOT NULL ASSERTION OPERATOR
    // nullableName!!.toLowerCase()

}