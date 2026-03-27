package DSA.Leetcode

class Solution03 {
    fun isAnagram(s: String, t: String): Boolean {
        if ((s.isEmpty() &&t.isNotEmpty())||(t.isEmpty() &&s.isNotEmpty())) return false
        val sSorted=s.toCharArray().sorted().joinToString("")
        val tSorted=t.toCharArray().sorted().joinToString("")
        return sSorted==tSorted
    }
}
fun main() {
    val answer= Solution03()
    println(answer.isAnagram("rat","car"))
}