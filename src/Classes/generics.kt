package Classes

fun main() {
    privateValue("Anupam")
    val obj= PQR("String")
    obj.printVal()
}
fun <T>privateValue(value:T){
    println(value)
}

class PQR<T>(var valu:T){
    fun printVal(){
        println("Value is $valu")
    }
}