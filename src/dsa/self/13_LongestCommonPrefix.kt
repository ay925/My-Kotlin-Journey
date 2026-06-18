package dsa.self

class Solution13 {
    fun longestCommonPrefix(strs: Array<String>): String {
        val n = strs.size
        var ans = ""
        val m = strs.minOf { it.length }
        for (j in 0 until m) {
            for (i in 0 until n - 1) {
                if (strs[i][j] != strs[i + 1][j]) {
                    return ans
                }
            }
            ans += strs[0][j]
        }
        return ans
    }
}

fun main() {
    val ans = Solution13()
    println(ans.longestCommonPrefix(arrayOf("ab", "a")))
}

//["Anupam","Amethi","Anantra"]
//["flower","flow","flight"]]
//["dog","racecar","car"]