package DSA.Leetcode

class Solution35 {
    fun search(nums: IntArray, target: Int): Int {
        val n = nums.size
        var ans = -1
        var low = 0
        var high = n - 1

        while (low <= high) {
            val mid = (low + high) / 2

            if (nums[mid] == target) {
                ans = mid
                break
            }
            else if (nums[mid] <= nums[high]) {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1
                } else {
                    high = mid - 1
                }
            }
            else {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1
                } else {
                    low = mid + 1
                }
            }
        }
        return ans
    }
}