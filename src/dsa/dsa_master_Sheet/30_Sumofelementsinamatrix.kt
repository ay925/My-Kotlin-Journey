package dsa.dsa_master_Sheet

class Solution30{
    fun sumOfMatrix(mat: List<List<Int>>): Int{
        val rows = mat.size
        val columns= mat[0].size
        var matrixSum =0
        for (i in 0 until rows){
            for (j in 0 until columns){
                matrixSum+=mat[i][j]
            }
        }
        return matrixSum
    }
}
fun main() {
    val solution = Solution30()
    val result = solution.sumOfMatrix(listOf(listOf(1, 0, 1, 0, 1),listOf(0, 1, 0, 1, 0),listOf(-1, -1, -1, -1, -1)))
    print(result)
}