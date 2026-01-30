fun main() {
    val q=DerivedClass()
    println(q.method1())
}
open class BaseClass{
    var name="BaseClass"
    fun method1(){
        println("I am base class")
    }
}
class DerivedClass:BaseClass(){
    var name2="DerivedClass"
    fun method2(){
        println("I am DerivedClass")
    }
}