fun main() {
    val animal=Animal("Cow",23,"Jersey","Black")
    val animal2=Animal("Dog","White")
    println(animal2.age)

//    println(animal.name)
//    println(animal.age)
//    println(animal.breed)
//    println(animal.colour)
}
class Animal(var name: String, var age:Int, var breed:String,var colour: String){
    constructor(animalName:String,animalColor: String):this(animalName,1,"jersey",animalColor)//this is called as a secondary constructor
//    var name: String=name
//    var age:Int =age
//    var breed: String=breed
//    var colour: String=colour
    init {
        println("Name of animal is: $name")
    }
    init {
        println("Breed of animal is : $breed")
    }
}