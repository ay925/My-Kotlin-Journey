package dsa.dsa_master_Sheet

class Solution53 {
    fun isAnagram(s: String, t: String): Boolean {
        val sSorted = s.toList().sorted()
        val tSorted = t.toList().sorted()
        return sSorted==tSorted
    }
}
fun main() {
    val solution = Solution53()
    val result = solution.isAnagram("anagram","nagaram")
    print(result)
}