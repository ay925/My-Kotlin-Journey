package Classes

fun main() {
//    val rect:Classes.Shape=Classes.Rectangle()
//    rect.draw()
    val array=arrayOf(Rectangle(),Circle(),Square(),Tringle())
    for (shape in array){
        shape.draw()
    }
}
open class Shape{
    open fun draw(){
        println("Drawing a shape")
    }
}
class Rectangle():Shape(){
    override fun draw(){
        println("Drawing a Classes.Rectangle")
    }
}

class Circle():Shape(){
    override fun draw(){
        println("Drawing a Classes.Circle")
    }
}

class Square():Shape(){
    override fun draw(){
        println("Drawing a Classes.Square")
    }
}

class Tringle():Shape(){
    override fun draw(){
        println("Drawing a Classes.Tringle")
    }
}

