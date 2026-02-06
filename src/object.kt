fun main() {
//    println(ABC.Name)
//    ABC.getName()
    val obj=object:Type{
    val Name="ABC"
    fun getName(){
        println("Name is ABC")
    }

        override fun type() {
            println("this is anonymous object")
        }
    }
    println(obj.Name)
    obj.type()
}
object ABC{
     val Name="ABC"
    fun getName(){
        println("Name is ABC")
    }
}
interface Type{
    fun type()
}