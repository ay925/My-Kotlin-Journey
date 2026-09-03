package dsa.dsa_master_Sheet

class Solution31{
    fun countZeros(mat: List<List<Int>>): Int{
        val rowsAndColumns = mat.size
        var countZero =0
        var i =0
        while (rowsAndColumns>i){
            var j =0
            while (rowsAndColumns>j){
                if (mat[i][j]==0){
                    countZero++
                }
                j++
            }
            i++
        }
        return countZero
    }
}
fun main() {
    val solution = Solution31()
    val result = solution.countZeros(listOf(listOf(0,0,0),listOf(0,0,1),listOf(0,1,1)))
    print(result)
}