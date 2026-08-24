package dsa.dsa_master_Sheet

class Solution {
    fun findElementAtIndex(i: Int, arr: IntArray): Int {
        return arr[i]
    }
}

fun main() {
    val solution = Solution()
    val result = solution.findElementAtIndex(0, intArrayOf(10, 20, 30, 40, 50))
    print(result)
}