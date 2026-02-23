package DSA.Classes

fun main() {

    val matrix = arrayOf(
        intArrayOf(7, 9, 2, 3),
        intArrayOf(20, 8, 0, 10),
        intArrayOf(29, 0, -10, 5),
        intArrayOf(4, 14, 6, 7)
    )

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

    // Step 3: Print matrix
    for (i in 0 until r) {
        for (j in 0 until c) {
            print("${matrix[i][j]} ")
        }
        println()
    }
}