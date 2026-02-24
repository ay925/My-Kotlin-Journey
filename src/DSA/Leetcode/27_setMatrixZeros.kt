package DSA.Leetcode

class Solution27 {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val r = matrix.size
        val c = matrix[0].size

        val rowTrack = IntArray(r)
        val colTrack = IntArray(c)
        // Step 1: Mark rows and columns
        for (i in 0 until r) {
            for (j in 0 until c) {
                if (matrix[i][j] == 0) {
                    rowTrack[i] = -1
                    colTrack[j] = -1
                }
            }
        }

        // Step 2: Set zeroes
        for (i in 0 until r) {
            for (j in 0 until c) {
                if (rowTrack[i] == -1 || colTrack[j] == -1) {
                    matrix[i][j] = 0
                }
            }
        }
    }
}