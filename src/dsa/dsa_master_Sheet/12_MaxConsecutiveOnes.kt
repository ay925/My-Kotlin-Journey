package dsa.dsa_master_Sheet

class Solution12 {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var maxOne = 0
        var currentCountOne = 0
        for (i in nums) {
            if (i == 1) {
                currentCountOne++
            } else {
                if (currentCountOne > maxOne) {
                    maxOne = currentCountOne
                }
                currentCountOne = 0
            }
        }
        if (currentCountOne > maxOne) {
            maxOne = currentCountOne
        }
        return maxOne
    }
}

fun main() {
    val solution = Solution12()
    val result = solution.findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 1, 1, 1, 1, 1, 1, 1))
    print(result)
}