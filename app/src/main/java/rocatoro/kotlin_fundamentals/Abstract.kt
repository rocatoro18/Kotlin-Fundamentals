package rocatoro.kotlin_fundamentals

// An abstract class cannot be instantiated
// (you cannot create objects of an abstract class).
// However, you can inherit subclasses from an abstract class.
// The members (properties and methods) of an abstract class are non-abstract
// unless you explicitly use the abstract keyword to make them abstract.

abstract class Mammal(private val name: String, private val origin: String,
private  val weight: Double){
    // Concrete (Non abstract) properties

    // Abstract property (Must be overridden by subclasses)
    abstract var maxSpeed: Double

    // Abstract methods (Must be implemented by subclasses)
    abstract fun run()
    abstract fun breath()

    // Concrete (Non Abstract) Method
    fun displayDetails(){
        println("Name: $name, Origin: $origin, Weight: $weight, " +
                "Max Speed: $maxSpeed")
    }

}

class Human(name: String, origin: String, weight: Double,
            override var maxSpeed: Double): Mammal(name,origin,weight){

    override fun run() {
        // Code to run
        println("Run on two legs")
    }

    override fun breath() {
        // Code to breath
        println("Breath through mouth or nose")
    }

}

class Elephant(name: String, origin: String, weight: Double,
override var maxSpeed: Double): Mammal(name, origin, weight){

    override fun run() {
        // Code to run
        println("Runs on four legs")
    }

    override fun breath() {
        // Code to breath
        println("Breath through the trunk")
    }
}

/*
    An abstract class allows you to create functionality
    that subclasses can implement or override. An interface
    only allows you to define functionality, not implement it.
    And whereas a class can extend only one abstract class,
    it can take advantage of multiple interfaces.
 */

fun main(){
    val human = Human("Roberto","Mexico",
    80.0,30.0)
    val elephant = Elephant("Masiosare","Mexico",
    5500.0,24.0)

    human.run()
    elephant.run()

    human.breath()
    elephant.breath()

}