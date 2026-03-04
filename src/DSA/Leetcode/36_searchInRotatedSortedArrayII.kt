package DSA.Leetcode

class Solution36{
    fun search(nums: IntArray, target: Int): Boolean {
        var low = 0
        var high = nums.size - 1
        var ans = false

        while (low <= high) {

            val mid = (low + high) / 2

            if (nums[mid] == target) {
                ans = true
                break
            }

            if (nums[mid] == nums[high]) {
                high--
            }
            else if (nums[mid] <= nums[high]) {

                if (target >= nums[mid] && target <= nums[high]) {
                    low = mid + 1
                } else {
                    high = mid - 1
                }

            } else {

                if (target >= nums[low] && target <= nums[mid]) {
                    high = mid - 1
                } else {
                    low = mid + 1
                }

            }
        }
        return ans
    }
}