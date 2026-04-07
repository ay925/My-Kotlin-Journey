package DSA.Neetcode

class Solution02 {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length!=t.length) return false
        val sSorted= s.toCharArray().sortedArray().contentToString()
        val tSorted= t.toCharArray().sortedArray().contentToString()
        return sSorted==tSorted
    }
}
fun main() {
    val answer= Solution02()
    print(answer.isAnagram("racecar","carrace"))
}
