package dsa.dsa_master_Sheet

class Solution03 {
    fun arraySum(arr: IntArray): Int {
        var sum = 0
        for (i in arr.indices) {
            sum += arr[i]
        }
        return sum
    }
}

fun main() {
    val solution = Solution03()
    val result = solution.arraySum(intArrayOf(1, 2, 3, 5, 4))
    print(result)
}
