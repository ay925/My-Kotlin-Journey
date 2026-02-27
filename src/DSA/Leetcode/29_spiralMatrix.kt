package DSA.Leetcode

class Solution29 {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val rows=matrix.size
        val cols =matrix[0].size

        var top =0
        var bottom=rows-1
        var left=0
        var right=cols-1

        val result=mutableListOf<Int>()
        while (left<=right && top<=bottom){
            // left to right
            for (i in left ..right){
                result.add(matrix[top][i])
            }
            top++

            // top to bottom
            for (i in top..bottom){
                result.add(matrix[i][right])
            }
            right--
            if (top<=bottom){
                //right to left
                for (i in right downTo left){
                    result.add(matrix[bottom][i])
                }
                bottom--
            }
            if (left<=right) {
                //bottom to top
                for (i in bottom downTo top) {
                    result.add(matrix[i][left])

                }
                left++
            }
        }
        return result
    }
}