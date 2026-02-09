package Classes

fun main() {
    val q=DerivedClass()
    println(q.method1())
}
open class BaseClass{
    var name="Classes.BaseClass"
    fun method1(){
        println("I am base class")
    }
}
class DerivedClass:BaseClass(){
    var name2="Classes.DerivedClass"
    fun method2(){
        println("I am Classes.DerivedClass")
    }
}