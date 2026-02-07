fun main() {
//    Person2.name()
//    Person2.Teacher.name()
//    val person=Person2("Student")
    val person2=Person2.Factory.create("Student")
    val person3=Person2.Factory.create("Teacher")
    println(person2.type)
    println(person3.type)
}
class Person2 private constructor(val type: String) {
//    companion object Student{
//        fun name(){
//            println("Its Student")
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
                "Student"->Person2("Student")
                "Teacher"->Person2("Teacher")
                else -> {Person2("Person")}
            }
    }

    }
}