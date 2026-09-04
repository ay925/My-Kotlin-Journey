package dsa.dsa_master_Sheet

class Solution33 {
    fun diagonalSum(mat: Array<IntArray>): Int {
        val rowAndColumns=mat.size
        var diagonalsSum=0
        for (i in  0 until rowAndColumns){
            for (j in 0 until rowAndColumns){
                if (i==j || i+j==rowAndColumns-1){
                    diagonalsSum+=mat[i][j]
                }
            }
        }
        return diagonalsSum
    }
}
fun main() {
    val solution = Solution33()
    val result = solution.diagonalSum(arrayOf(intArrayOf(1,1,1,1), intArrayOf(1,1,1,1), intArrayOf(1,1,1,1),intArrayOf(1,1,1,1)))
    print(result)
}