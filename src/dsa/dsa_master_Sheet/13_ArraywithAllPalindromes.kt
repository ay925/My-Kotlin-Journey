package dsa.dsa_master_Sheet

class Solution13 {
    fun isPalinArray(arr: IntArray): Boolean {
        for (i in arr.indices) {
            if (!isNumberPalindrome(arr[i])) {
                return false
            }
        }
        return true
    }

    fun isNumberPalindrome(number: Int): Boolean {
        var n = number
        var revNumber = 0
        while (n > 0) {
            val ld = n % 10
            revNumber *= 10
            revNumber += ld
            n /= 10
        }
        return number == revNumber
    }
}

fun main() {
    val solution = Solution13()
    val result = solution.isPalinArray(intArrayOf(111, 222, 333, 444, 555))
    print(result)
}
