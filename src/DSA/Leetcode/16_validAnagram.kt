package DSA.Leetcode

class Solution16 {
    fun isAnagram(s: String, t: String): Boolean {
      val s=s.toCharArray().sorted().joinToString("")
        val t =t.toCharArray().sorted().joinToString("")
        if (s==t){
            return true
        }
        return false
}
}

fun main() {
    val q= Solution16()
    println(q.isAnagram("anagram","nagaram"))
}