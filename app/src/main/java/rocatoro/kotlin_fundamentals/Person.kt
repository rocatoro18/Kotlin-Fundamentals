package rocatoro.kotlin_fundamentals

import java.lang.IllegalArgumentException

fun main(){
    // Creating instances of classes
    var Roberto = Person("Roberto","Torres",22)
    var John = Person()
    var Carlos = Person(lastName = "Rosas")
    Roberto.hobby = "watch netflix"
    println("Roberto age = ${Roberto.age}")
    Roberto.stateHobby()
    John.hobby = "play video games"
    John.stateHobby()
    var iphone = MobilePhone("IOS","APPLE","IPHONE14")
    var phone2 = MobilePhone("ANDROID","SAMSUNG","GALAXY20")
    var iphone3 = MobilePhone("IOS","APPLE","IPHONE12")
    myFunction2(5)

    var myCar = Car()
    myCar.owner
    myCar.maxSpeed = 200

    println("Brand is: ${myCar.myBrand}")
    println("Max Speed: ${myCar.maxSpeed}")
    println("My Model is: ${myCar.myModel}")

}

// this is a parameter
fun myFunction2(a: Int){
    // a is a variable
    var a = a
    println("a es $a")

}

class Person (firstName: String = "John", lastName: String = "Doe"){

    // Member variables - properties
    var age: Int ?= null
    var hobby: String = "play video games"
    var FirstName: String ?= null

    // Initializer block
    init{
        this.FirstName = firstName
        println("Person created a new Person object with firstName" +
                " = $firstName and lastName = $lastName")
    }

    // Member functions - methods

    fun stateHobby(){
        println("$FirstName\'s hobby is $hobby")
    }

    // Member secondary constructor
    constructor(firstName: String,lastName: String,age: Int):
            this(firstName,lastName){
                this.age = age
        println("Person created a new Person object with firstName" +
                " = $firstName and lastName = $lastName and age = $age")
            }

}

class MobilePhone (osName: String, brand: String, model: String){

    init {
        println(
            "osName = $osName, brand = $brand, model = $model"
        )
    }

}

class Car(){
    // lateinit is for initialize variable later
    lateinit var owner: String

    val myBrand = "Mercedes Benz"
        // Custom getter
    get(){
        return field.lowercase()
    }

    var maxSpeed: Int = 250
        set(value) {if (value > 0) value else throw IllegalArgumentException("Max Speed cannot be less than 0")}
    /* redundant get and setter
        get(){
        return field
        } set(value) {
        field = value
        }
    */

    var myModel: String = "GLE63AMG"
    private set


    init {
        this.myModel = "GLE62AMG"
        this.owner = "Carlos"
    }


}
