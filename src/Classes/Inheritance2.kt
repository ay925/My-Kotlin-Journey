package Classes

fun main() {
    val car=Car("yellow")
    car.drive()
}
open class Vehicle(color: String){
    init {
        println("Classes.Vehicle class created")
    }
    open var name="Classes.Vehicle"
    open fun drive(){
        println("Classes.Vehicle is driving")
    }
}
class Car(carColor: String):Vehicle(carColor){
    init {
        println("Classes.Car class created")
    }
    override var name="Classes.Car"
    override fun drive(){
        super.drive()
       println("Classes.Car is driving")

    }
}