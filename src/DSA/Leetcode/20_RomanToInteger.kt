package DSA.Leetcode

class Solution20 {
    fun romanToInt(s: String): Int {
        val letters=mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
        var result=0
        val n=s.length
        for (i in 0 until n) {
            val curr = letters[s[i]]!!
            val next = if (i < n - 1) letters[s[i + 1]]!! else 0

            if (curr < next) {
                result -= curr
            } else {
                result += curr
            }
        }
        return result
    }
}

fun main() {
    val q= Solution20()
    println(q.romanToInt("IV"))
}