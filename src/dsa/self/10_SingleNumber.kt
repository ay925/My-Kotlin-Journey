package dsa.self

class Solution10 {
    fun singleNumber(nums: IntArray): Int {
        val frequency = mutableMapOf<Int, Int>()

        for (i in nums) {
            frequency[i] = frequency.getOrDefault(i, 0) + 1
        }
        for ((key, value) in frequency) {
            if (value == 1) {
                return key
            }
        }
        return 0
    }
}

fun main() {
    val ans = Solution10()
    println(ans.singleNumber(intArrayOf(2, 2, 5)))
}