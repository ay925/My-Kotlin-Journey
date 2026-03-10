package DSA.Leetcode

class Solution40 {
    fun firstMissingPositive(nums: IntArray): Int {

        var i = 0

        while (i < nums.size) {

            val correctIndex = nums[i] - 1

            if (nums[i] > 0 &&
                nums[i] <= nums.size &&
                nums[i] != nums[correctIndex]) {

                val temp = nums[i]
                nums[i] = nums[correctIndex]
                nums[correctIndex] = temp

            } else {
                i++
            }
        }

        for (j in nums.indices) {
            if (nums[j] != j + 1) {
                return j + 1
            }
        }

        return nums.size + 1
    }
}