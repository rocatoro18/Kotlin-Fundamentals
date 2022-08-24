package rocatoro.kotlin_fundamentals

/*
    The class that inherits the features
    of another class is called the sub class
    or child class or derived class, and the
    class whose features are inherited is called
    super class or parent class or base class
 */

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

// open word it is for inherit on classes
// Super class, parent class or base class
open class Vehicle{
    // properties
    // methods

}

// Sub class, child class or derived class of vehicle
// Super class, parent class or base class of vehicle
open class Car1(override val maxSpeed: Double, val name: String, val brand: String): Drivable{
    open var range : Double = 0.0

    fun extendRange(amount:Double){
        if(amount > 0){
            range += amount
        }
    }

    override fun drive(): String = "driving the interface drive"
    /*override fun drive(): String {
        return "driving the interface drive"
    }
    */
    open fun drive(distance:Double){
        println("Drove for $distance KM")
    }

}

// Sub class, child class or derived class of Car1 class
class  ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double)
    : Car1(maxSpeed, name, brand){
    override var range = batteryLife * 6
    var chargerType = "Type1"

    override fun drive(distance: Double){
        println("Drove $distance KM on electricity")
    }

    override fun drive(): String{
        return "Drove $range on electricity"
    }

    override fun brake() {
        super.brake()
        println("Brake inside electric car")
    }


}

fun main(){
    var audiA3 = Car1(250.0,"A3","AUDI")
    var teslaModelX = ElectricCar(280.0,"MODEL X","TESLA",100.0)
    teslaModelX.chargerType = "Type2"
    //println(audiA3)
    //println(teslaModelX)

    teslaModelX.drive()
    teslaModelX.brake()
    audiA3.brake()
    teslaModelX.extendRange(150.0)

    // Polymorphism is the provision of a single interface to entities of different types
    audiA3.drive(200.0)
    teslaModelX.drive(150.0)

}