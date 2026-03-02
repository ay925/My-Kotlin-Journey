package DSA.Classes

fun searchRange(nums: IntArray, target: Int): IntArray {
    return intArrayOf(
        findFirst(nums, target),
        findLast(nums, target)
    )
}

fun findFirst(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1
    var ans = -1

    while (left <= right) {
        val mid = left + (right - left) / 2

        if (nums[mid] == target) {
            ans = mid
            right = mid - 1   // move left
        } else if (nums[mid] < target) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    return ans
}

fun findLast(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1
    var ans = -1

    while (left <= right) {
        val mid = left + (right - left) / 2

        if (nums[mid] == target) {
            ans = mid
            left = mid + 1    // move right
        } else if (nums[mid] < target) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    return ans
}