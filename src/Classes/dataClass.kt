package Classes

fun main() {
    val student1=Student("Anupam Yadav",100,18)
    val student2=Student("Anupam Yadav",100,18)
    val student3=student2.copy(name = "Vibhav")
    println(student1 == student2)
    println(student3)
    println(student3.component2())
    val(studName,studGrade,studAge)=student2
//    println(studName)
//    println(studGrade)
//    println(studAge)
    println(student1.hashCode())
    println(student2.hashCode())
    println(student3.hashCode())
}
data class Student(val name:String,var grade:Int,val age:Int)