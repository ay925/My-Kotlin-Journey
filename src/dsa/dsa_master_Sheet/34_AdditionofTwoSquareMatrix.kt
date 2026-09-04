package dsa.dsa_master_Sheet

class Solution34 {
    fun addMat(a: Array<IntArray>, b: Array<IntArray>): Array<IntArray> {
        val rowsAndColumns = a.size
        val addMat = Array(rowsAndColumns) { IntArray(rowsAndColumns) }
        for (i in 0 until rowsAndColumns) {
            for (j in 0 until rowsAndColumns) {
                addMat[i][j]=a[i][j]+b[i][j]
            }
        }
        return addMat
    }
}

fun main() {
    val solution = Solution34()
    val result = solution.addMat(
        a = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3,4),
        ), b = arrayOf(
            intArrayOf(3,4),
            intArrayOf(2,1),
        )
    )
    print(result.contentDeepToString())
}