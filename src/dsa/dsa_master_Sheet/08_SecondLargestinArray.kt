package dsa.dsa_master_Sheet

class Solution08 {
    fun getSecondLargest(arr: IntArray): Int {
        var largest = Int.MIN_VALUE
        var secondLargest = Int.MIN_VALUE
        for (i in arr.indices) {
            if (arr[i] > largest) {
                secondLargest = largest
                largest = arr[i]
            }
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i]
            }
        }
        if (secondLargest == Int.MIN_VALUE) {
            secondLargest = -1
        }
        return secondLargest
    }
}

fun main() {
    val solution = Solution08()
    val result = solution.getSecondLargest(intArrayOf(10, 10, 10))
    print(result)
}