fun main() {
//    val rect:Shape=Rectangle()
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
        println("Drawing a Rectangle")
    }
}

class Circle():Shape(){
    override fun draw(){
        println("Drawing a Circle")
    }
}

class Square():Shape(){
    override fun draw(){
        println("Drawing a Square")
    }
}

class Tringle():Shape(){
    override fun draw(){
        println("Drawing a Tringle")
    }
}

