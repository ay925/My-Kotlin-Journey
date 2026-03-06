package DSA.Leetcode

class Solution38 {
    fun generate(numRows: Int): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()

        for (i in 0 until numRows) {
            val row = mutableListOf<Int>()
            var value = 1

            for (j in 0..i) {
                row.add(value)
                value = value * (i - j) / (j + 1)
            }

            ans.add(row)
        }

        return ans
    }
}

fun main() {
    val q = Solution38()
    println(q.generate(14))
}

