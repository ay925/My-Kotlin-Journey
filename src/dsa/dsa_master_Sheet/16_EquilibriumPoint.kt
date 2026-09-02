package dsa.dsa_master_Sheet

class Solution16{
    fun findEquilibrium(nums: IntArray): Int {
        val n = nums.size
        var leftSum = 0
        var totalSum = 0

        for (i in 0 until n) {
            totalSum += nums[i]
        }

        for (i in 0 until n) {
            val rightSum = totalSum - leftSum - nums[i]

            if (leftSum == rightSum) {
                return i
            }

            leftSum += nums[i]
        }

        return -1
    }
}


fun main() {
    val solution = Solution16()
    val result = solution.findEquilibrium(intArrayOf(1,1,1,1)) // [2 , 0 , 2 , 1 , 1 , 0]
    print(result)
}