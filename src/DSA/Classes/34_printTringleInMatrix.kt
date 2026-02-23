package DSA.Classes

fun main() {
    val nums = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )

        val rows = nums.size
        val cols = nums[0].size

        // Upper
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (j >= i) {
                    print("${nums[i][j]} ")
                } else {
                    print("* ")
                }
            }
            println()
        }

        println()

        // Lower
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (j <= i) {
                    print("${nums[i][j]} ")
                } else {
                    print("* ")
                }
            }
            println()
        }

        println()

        // Diagonal
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (j == i) {
                    print("${nums[i][j]} ")
                } else {
                    print("* ")
                }
            }
            println()
        }

        println()

        // Reverse Diagonal
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (j + i == cols - 1) {
                    print("${nums[i][j]} ")
                } else {
                    print("* ")
                }
            }
            println()
        }

}