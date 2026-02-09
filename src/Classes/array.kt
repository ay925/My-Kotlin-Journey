package Classes

fun main() {
    val array=arrayOf(10,20,30,1,20)
    var array2=arrayOf<String>("anupam","vibhav")
//    println(array.joinToString())

    for ((i,e) in array2.withIndex()){
        println("$i $e")
    }
    array2[1]="Ayush"
    array2.set(1,"Ansh")

    println(array2[1])
    println(array2.get(1))
}