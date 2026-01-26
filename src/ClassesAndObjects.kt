fun main() {
    val person1=Person("Anupam Yadav",18,"Male","Student")
    val person2=Person("Aditya Yadav",19,"Male","Businessman")
    val person3=Person("Ayush verma",18,"Male","Student")
    println("Person1 name is ${person1.name}")
    person1.work()
    println("Person2 name is ${person2.name}")
    person2.work()
    println("Person3 name is ${person3.name}")
    person3.work()
}
class Person(var name: String,var age: Byte,var gender: String,var occupation: String){
//    var name: String="Anupam Yadav"
//    var age: Byte=18
//    var gender: String="Male"
//    var occupation="Student"

    fun work(){
        println("$name is $occupation")
    }
    fun getAge(){
        println("Age is $age")
    }
    fun getGender(){
        println("Gender is $gender")
    }

}