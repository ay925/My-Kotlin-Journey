package dsa.dsa_master_Sheet

class Solution32 {
    fun countNegatives(grid: Array<IntArray>): Int {
        val rows = grid.size
        val columns = grid[0].size
        var countNegative = 0
        for (i in 0 until rows){
            for (j in 0 until columns){
                if (grid[i][j]<0) {
                    countNegative++
                }
            }
        }
        return countNegative

    }

}

fun main() {
    val solution = Solution32()
    val result = solution.countNegatives(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 1), intArrayOf(0, -1, 1)))
    print(result)
}