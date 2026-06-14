package dsa.self

class Solution11 {
    fun romanToInt(s: String): Int {
        val romanMap = mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
        var ans = 0
        val n = s.length
        for (i in 0 until n) {
            if (i < n - 1 && romanMap[s[i]]!! < romanMap[s[i + 1]]!!) {
                ans -= romanMap[s[i]]!!
            } else {
                ans += romanMap[s[i]]!!
            }
        }
        return ans
    }
}

fun main() {
    val ans = Solution11()
    println(ans.romanToInt("MCMXCIV"))
}