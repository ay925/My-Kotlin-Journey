package dsa.dsa_master_Sheet

class Solution65 {
    fun search(nums: IntArray, target: Int): Int {
        val n = nums.size
        var low = 0
        var high = n - 1
        while (high >= low) {
            val mid = (low + high) / 2
            if (nums[mid] == target) {
                return mid
            } else if (nums[mid] < target) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }
        return -1
    }
}

fun main() {
    val solution = Solution65()
    val result = solution.search(intArrayOf(-1, 0, 3, 5, 9, 12), 2)
    println(result)
}