package dsa.dsa_master_Sheet

class Solution36 {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val rows = matrix.size
        val columns = matrix[0].size
        val transposeMatrix = Array<IntArray>(columns) { IntArray(rows) }
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                transposeMatrix[j][i] = matrix[i][j]
            }
        }
        return transposeMatrix
    }
}

fun main() {
    val solution = Solution36()
    val result = solution.transpose(
        arrayOf(
            intArrayOf(1, 2,3),
            intArrayOf(4,5,6),
        )
    )
    print(result.contentDeepToString())
}