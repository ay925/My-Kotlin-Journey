package dsa.dsa_master_Sheet

class Solution10 {
    fun missingNumber(nums: IntArray): Int {
        var numsSum = 0
        var numsSizeSum = 0
        for (i in nums) {
            numsSum += i
        }
        for (i in 1..nums.size) {
            numsSizeSum += i
        }
        val missingNumber = numsSum - numsSizeSum
        return missingNumber
    }
}


fun main() {
    val solution = Solution10()
    val result = solution.missingNumber(intArrayOf(1, 2))
    print(result)
}