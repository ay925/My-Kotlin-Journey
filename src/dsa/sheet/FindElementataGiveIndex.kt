package dsa.sheet

class Solution01 {
    fun findElementAtIndex(i: Int, arr: IntArray): Int {
        return arr[i]
    }
}

fun main() {
    val solution = Solution01()
    println(solution.findElementAtIndex(2, intArrayOf(10, 20, 30, 40, 50)))
}

