package Classes

fun main() {
    val emp= Employee()
    var x=emp.apply {
        id=1
        name="Abc"
    }
//    println(x)
    val emp1: Employee? = Employee()
    val y=emp1?.let {
//        println(it.name)
    }
    val z=with(emp){
        println(this.name)
    }
    val a=emp.run {
        println(name)
        name
    }
    val b=emp.also {
        println("Name is ${it.name}")
    }

}
class Employee{
    var id=0
    var name=""
}