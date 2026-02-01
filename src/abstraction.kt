fun main() {
//    val rect:Shape=Rectangle()
//    rect.draw()
    val shape =Rectangles()
    val array=arrayOf(Rectangles(),Circles(),Squares(),Tringles(),Picture())
    for (shape in array){
//        shape.draw()
        shape.name()
    }
//    val pic1=Picture()
//    pic1.name()
}
abstract class Shapes:Name{
    abstract var i:Int
    abstract fun draw()
//    abstract fun name()
    fun type(){

    }
}
interface Name{
    fun name()
}
//interface xyz{
//    fun xyz()
//}
class Rectangles():Shapes(){
    override var i=0
    override fun draw(){
        println("Drawing a Rectangle")
    }

    override fun name() {
        println("Name is Rectangle")
    }
}

class Circles():Shapes(){
    override var i=0
    override fun draw(){
        println("Drawing a Circle")
    }

    override fun name() {
        println("Name is Circle")

    }
}

class Squares():Shapes(){
    override var i=0
    override fun draw(){
        println("Drawing a Square")
    }

    override fun name() {
        println("Name is Square")

    }
}

class Tringles():Shapes(){
    override var i=0
    override fun draw(){
        println("Drawing a Tringle")
    }

    override fun name() {
        println("Name is Tringle")

    }
}
class Picture:Name{
     override fun name(){
        println("Name is picture")
    }
}



