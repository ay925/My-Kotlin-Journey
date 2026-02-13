package my_Project

fun main(){
    val rectangle= Rectangle(length = 20.0, width = 30.0)
    rectangle.perimeter()
}
class Rectangle(val length: Double, val width: Double){
    fun area(){
        println("Area is ${length*width}")
    }
    fun perimeter(){
        println("Perimeter is ${2*(length+width)}")
    }
}