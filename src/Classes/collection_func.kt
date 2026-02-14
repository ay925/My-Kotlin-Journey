package Classes

import java.util.Locale
import java.util.Locale.getDefault

fun main() {
    val list=listOf("Msc","Civic","Madam","Mom","Radar","Mca")
//    val palindrome=list.filter(::isPalindrome)
//    println(palindrome)
//    val Uppercasse=list.map { it.uppercase(getDefault()) }
//    println(Uppercasse)
    list.forEach { println(it)}
    println(list.size)
}
fun isPalindrome(str: String): Boolean{

    return str.lowercase()==str.lowercase().reversed()
}