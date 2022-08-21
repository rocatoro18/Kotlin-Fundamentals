package rocatoro.kotlin_fundamentals

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
