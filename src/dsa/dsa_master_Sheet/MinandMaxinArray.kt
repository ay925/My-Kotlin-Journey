package dsa.dsa_master_Sheet

class Solution02 {
    fun getMinMax(arr: IntArray): List<Int> {
        var min = arr[0]
        var max = arr[0]
        for (i in arr.indices) {
            if (arr[i] > max) {
                max = arr[i]
            }
            if (arr[i] < min) {
                min = arr[i]
            }
        }
        return listOf(min, max)
    }
}

fun main() {
    val solution = Solution02()
    val result = solution.getMinMax(intArrayOf(10, 20, 30, 50, 40))
    print(result)
}