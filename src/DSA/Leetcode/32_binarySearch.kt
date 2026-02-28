package DSA.Leetcode

class Solution32 {
    fun search(nums: IntArray, target: Int): Int {
        val n = nums.size
        var low = 0
        var high = n - 1
        var ans = -1
        while (low <= high) {
            val mid = (low + high) / 2
            if (nums[mid] == target) {
                ans = mid
                return ans
            } else if (nums[mid] < target) low = mid + 1
            else high = mid - 1
        }
        return ans
    }
}