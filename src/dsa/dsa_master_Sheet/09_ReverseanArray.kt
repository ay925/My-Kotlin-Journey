package dsa.dsa_master_Sheet

class Solution09 {
    fun reverseArray(arr: IntArray): IntArray {
        val n = arr.size
        var min = 0
        var max = n - 1
        while (max > min) {
            val temp = arr[min]
            arr[min] = arr[max]
            arr[max] = temp
            min++
            max--
        }
        return arr
    }
}

fun main() {
    val solution = Solution09()
    val result = solution.reverseArray(intArrayOf(1, 4, 3, 2, 6, 5))
    print(result.contentToString())
}