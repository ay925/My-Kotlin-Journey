package dsa.dsa_master_Sheet

class Solution14 {
    fun moveZeroes(nums: IntArray): Unit {
        val n = nums.size
        var i = 0
        var j = 1

        while (n > j) {
            if (nums[i] == 0 && nums[j] != 0) {
                val temp = 0
                nums[i] = nums[j]
                nums[j] = 0
                i++
                j++
            } else if (nums[i] == 0 && nums[j] == 0) {
                j++
            } else {
                i++
                j++
            }
        }
        print(nums.contentToString())
    }
}

fun main() {
    val solution = Solution14()
    val result = solution.moveZeroes(intArrayOf(1, 0, 1))
    print(result)
}
