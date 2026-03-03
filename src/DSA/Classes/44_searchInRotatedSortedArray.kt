package DSA.Classes
fun main() {
        val nums = intArrayOf(1, 4, 5, 6, 8, 9, 10, 11, 15, 20)

        val n = nums.size
        var ans = -1
        var low = 0
        var high = n - 1
        val target = 15

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

        println(ans)
}