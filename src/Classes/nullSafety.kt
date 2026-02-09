package Classes

fun main() {
    val s: String="Anupam"
    val s1: String?=null
    println(s.isPalindrome())
//    if (s1 != null) {
//        println(s1.isPalindrome())
//    }
    println(s1?.isPalindrome())
    println(s1?.length?:0)
//    println(s1!!.length)
    s1?.let { println(it.length) }
}