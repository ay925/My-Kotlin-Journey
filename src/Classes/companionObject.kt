package Classes

fun main() {
//    Classes.Person2.name()
//    Classes.Person2.Teacher.name()
//    val person=Classes.Person2("Classes.Student")
    val person2=Person2.Factory.create("Classes.Student")
    val person3=Person2.Factory.create("Teacher")
    println(person2.type)
    println(person3.type)
}
class Person2 private constructor(val type: String) {
//    companion object Classes.Student{
//        fun name(){
//            println("Its Classes.Student")
//        }
//    }
//    object Teacher{
//        fun name(){
//            println("Its Teacher")
//        }
//    }
    object Factory{
        fun create(type:String):Person2{
            return when(type){
                "Classes.Student"->Person2("Classes.Student")
                "Teacher"->Person2("Teacher")
                else -> {Person2("Classes.Person")}
            }
    }

    }
}