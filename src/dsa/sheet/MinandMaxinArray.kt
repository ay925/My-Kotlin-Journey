package dsa.sheet

class Solution02 {
    fun getMinMax(arr: IntArray): List<Int> {
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE

        for (i in arr.indices) {
            if (arr[i] < min) {
                min = arr[i]
            }
            if (arr[i] > max) {
                max = arr[i]
            }
        }
        return listOf(min, max)
    }
}

fun main() {
    val solution = Solution02()
    println(solution.getMinMax(intArrayOf(32011, 123, 1045, 1205, 254, 28763, 6537, 3161)))
}

