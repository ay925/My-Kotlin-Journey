package dsa.self

class Solution12 {
    fun lengthOfLastWord(s: String): Int {
        val finalS = s.trim()
        val n = finalS.length
        var ans = 0
        for (i in n - 1 downTo 0) {
            if (finalS[i] == ' ') {
                break
            } else {
                ans += 1
            }
        }
        return ans
    }
}

fun main() {
    val ans = Solution12()
    println(ans.lengthOfLastWord("hello world"))
}