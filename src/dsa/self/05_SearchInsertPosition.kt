package dsa.self

class Solution05 {
    fun searchInsert(nums: IntArray, target: Int): Int {
        val n = nums.size
        var i = 0
        var j = n - 1
        while (i <= j) {
            val mid = (i + j) / 2
            if (nums[mid] == target) {
                return mid
            } else if (nums[mid] < target && mid == n - 1) {
                return mid + 1
            } else if (nums[mid] < target && nums[mid + 1] > target) {
                return mid + 1
            } else if (nums[mid] < target) {
                i = mid + 1
            } else {
                j = mid - 1
            }
        }
        return i
    }
}