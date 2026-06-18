package dsa.self

class Solution14 {
    fun isAnagram(s: String, t: String): Boolean {
        val sSorted = s.toCharArray().sortedArray()
        val tSorted = t.toCharArray().sortedArray()
        return sSorted.contentEquals(tSorted)
    }
}

fun main() {
    val ans = Solution14()
    println(ans.isAnagram("rat", "car"))
}