package my_Project

fun main() {
    val student1= Student("Anupam",22,100)
    student1.showDetails()
    student1.isPass()
}
class Student(val name: String, val rollNo:Int, val marks:Int){

    fun showDetails(){
        println("Your name is $name and rollNo is $rollNo and marks is $marks ")
    }
    fun isPass(){
        if (marks>=33){
            println("You are pass")
        }else{
            println("You are fail")
        }
    }
}