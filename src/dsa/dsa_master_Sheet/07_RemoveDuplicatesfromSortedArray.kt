package dsa.dsa_master_Sheet

class Solution07 {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        var j = 1
        val numsSize = nums.size
        val numList = mutableListOf<Int>()
        while (numsSize > j) {
            if (nums[i] == nums[j]) {
                j += 1
            } else {
                numList.add(nums[i])
                val temp = nums[j]
                nums[j] = nums[i + 1]
                nums[i + 1] = temp
                i += 1
                j += 1
            }
        }
        return numList.size + 1
    }
}

fun main() {
    val solution = Solution07()
    val result =
        solution.removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))
    print(result)
}