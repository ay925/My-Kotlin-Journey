package Classes

import kotlin.math.PI

fun main() {
    val circle=Circle2()
    println(circle.area(2.0))
    println(circle.parameter(3))
    val str="Madam"
    println(str.isPalindrome())
}
class Circle2{
    fun area(r: Double): Double{
        return PI*r*r
    }
}
fun Circle2.parameter(r:Int): Double{
    return 2*PI*r
}
fun String.isPalindrome(): Boolean{
    return this.lowercase()==this.lowercase().reversed()
}