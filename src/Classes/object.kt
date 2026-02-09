package Classes

fun main() {
//    println(Classes.ABC.Classes.Name)
//    Classes.ABC.getName()
    val obj=object:Type{
    val Name="Classes.ABC"
    fun getName(){
        println("Classes.Name is Classes.ABC")
    }

        override fun type() {
            println("this is anonymous object")
        }
    }
    println(obj.Name)
    obj.type()
}
object ABC{
     val Name="Classes.ABC"
    fun getName(){
        println("Classes.Name is Classes.ABC")
    }
}
interface Type{
    fun type()
}