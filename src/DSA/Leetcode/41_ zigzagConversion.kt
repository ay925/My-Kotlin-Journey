package DSA.Leetcode

class Solution41 {
    fun convert(s: String, numRows: Int): String {
        // Edge cases: if 1 row or more rows than characters, return original string
        if (numRows == 1 || numRows >= s.length) return s

        // Create an array to hold each row's characters
        val rows = Array(numRows) { StringBuilder() }
        var currentRow = 0
        var goingDown = false

        // Build the zigzag pattern
        for (char in s) {
            rows[currentRow].append(char)

            // Change direction at the top or bottom row
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown
            }

            // Move to next row
            currentRow += if (goingDown) 1 else -1
        }

        // Join all rows to form the result
        return rows.joinToString("") { it.toString() }
    }
}