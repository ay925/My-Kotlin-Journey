package dsa.dsa_master_Sheet

class Solution04 {
    fun sumOfDigits(n: Int): Int {
        var sum = 0
        var num = n
        while (num > 0) {
            val ld = num % 10
            sum += ld
            num /= 10
        }
        return sum
    }
}

fun main() {
    val solution = Solution04()
    val result = solution.sumOfDigits(123)
    print(result)
}
