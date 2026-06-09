package dsa.self

class Solution06 {
    fun plusOne(digits: IntArray): IntArray {
        val n = digits.size
        val ld = digits[n - 1]
        if (ld == 9) {
            for (i in n - 1 downTo 0) {
                if (digits[i] == 9 && i >= 1) {
                    digits[i] = 0
                } else {
                    if (digits[i] < 9) {
                        digits[i] += 1
                        break
                    } else {
                        val n = IntArray(n + 1) { 0 }
                        n[0] = 1
                        return n
                    }
                }
            }
        } else if (ld < 9) {
            digits[n - 1] += 1
        }
        return digits
    }
}

fun main() {
    val ans = Solution06()
    val finalAns = ans.plusOne(intArrayOf(1, 0))
    println(finalAns.contentToString())
}