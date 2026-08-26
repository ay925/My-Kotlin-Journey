package dsa.dsa_master_Sheet

class Solution06 {
    fun getAlternates(arr: IntArray): List<Int> {
        val l = mutableListOf<Int>()
        for (i in arr.indices step 2) {
            l.add(arr[i])
        }
        return l
    }
}

fun main() {
    val solution = Solution06()
    val result = solution.getAlternates(intArrayOf(1, 2, 3, 4, 5))
    print(result)
}