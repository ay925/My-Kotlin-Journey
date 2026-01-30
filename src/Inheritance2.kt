import java.awt.Color

fun main() {
    val car=Car("yellow")
    car.drive()
}
open class Vehicle(color: String){
    init {
        println("Vehicle class created")
    }
    open var name="Vehicle"
    open fun drive(){
        println("Vehicle is driving")
    }
}
class Car(carColor: String):Vehicle(carColor){
    init {
        println("Car class created")
    }
    override var name="Car"
    override fun drive(){
        super.drive()
       println("Car is driving")

    }
}