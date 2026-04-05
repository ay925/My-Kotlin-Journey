package DSA.Leetcode


class Solution11 {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            if (digits[i] < 9) {
                digits[i]++
                return digits
            }
            digits[i] = 0
        }

        val result = IntArray(digits.size + 1)
        result[0] = 1
        return result
    }
}
fun main() {
    val answer= Solution11()
    print(answer.plusOne(intArrayOf(1,9,9,9)).joinToString())
}