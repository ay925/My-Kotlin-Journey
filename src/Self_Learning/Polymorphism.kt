package Self_Learning

fun main() {
    val tringle: Shape= Circle(5.0)
    println(tringle.area())
}
open class Shape{
    open fun area(): Double{
        return 0.0
    }
}
class Circle(val radius: Double): Shape(){
    override fun area(): Double {
        return Math.PI *radius*radius
    }
}
class Square(val side: Double): Shape(){
    override fun area(): Double {
        return side*side
    }
}
class Tringle(val base: Double, val height: Double): Shape(){
    override fun area(): Double {
        return 0.5 *base*height
    }
}