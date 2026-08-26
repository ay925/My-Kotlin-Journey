package dsa.dsa_master_Sheet

class Solution05 {
    fun isSorted(arr: IntArray): Boolean {
        var i = 0
        var j = 1
        while (j < arr.size) {
            if (arr[i] > arr[j]) {
                return false
            }
            i += 1
            j += 1
        }
        return true
    }
}

fun main() {
    val solution = Solution05()
    val result = solution.isSorted(intArrayOf(1, 2, 3, 5, 4))
    print(result)
}