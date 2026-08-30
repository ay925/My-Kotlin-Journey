package dsa.dsa_master_Sheet

class Solution11 {
    fun segregate0and1(arr: IntArray): IntArray {
        var left = 0
        var right = arr.size - 1
        while (right > left) {
            if (arr[left] == 0) {
                left++
            } else if (arr[right] == 1) {
                right--
            } else {
                val temp = arr[left]
                arr[left] = arr[right]
                arr[right] = temp
                left++
                right--
            }

        }
        return arr
    }
}

fun main() {
    val solution = Solution11()
    val result = solution.segregate0and1(intArrayOf(0, 1, 0, 1, 0, 0, 1, 1, 1, 0))
    print(result.contentToString())
}
