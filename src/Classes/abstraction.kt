package Classes

fun main() {
//    val rect:Classes.Shape=Classes.Rectangle()
//    rect.draw()
    val shape =Rectangles()
    val array=arrayOf(Rectangles(),Circles(),Squares(),Tringles(),Picture())
    for (shape in array){
//        shape.draw()
        shape.name()
    }
//    val pic1=Classes.Picture()
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
        println("Drawing a Classes.Rectangle")
    }

    override fun name() {
        println("Classes.Name is Classes.Rectangle")
    }
}

class Circles():Shapes(){
    override var i=0
    override fun draw(){
        println("Drawing a Classes.Circle")
    }

    override fun name() {
        println("Classes.Name is Classes.Circle")

    }
}

class Squares():Shapes(){
    override var i=0
    override fun draw(){
        println("Drawing a Classes.Square")
    }

    override fun name() {
        println("Classes.Name is Classes.Square")

    }
}

class Tringles():Shapes(){
    override var i=0
    override fun draw(){
        println("Drawing a Classes.Tringle")
    }

    override fun name() {
        println("Classes.Name is Classes.Tringle")

    }
}
class Picture:Name{
     override fun name(){
        println("Classes.Name is picture")
    }
}



