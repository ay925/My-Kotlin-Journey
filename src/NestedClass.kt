class OuterClass{
    init {
        println("Outer Class")
    }
    var name="Outer class"
    inner class InnerClass{
        init {
            println("inner class Class")
        }
        fun innerFunction(){
            println("Inside inner class $name")
        }
    }
}

fun main() {
    val inClass= OuterClass().InnerClass()
    inClass.innerFunction()
}