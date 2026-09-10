package dsa.dsa_master_Sheet


class Solution52 {
    fun isPalindrome(s: String): Boolean {
        val cleanedString = s.filter { it.isLetterOrDigit() }.lowercase()
        val size = cleanedString.length
        var left =0
        var right =size-1
        while (right>left){
            if (cleanedString[left]!=cleanedString[right]) return false
            left++
            right--
        }
        return true
    }
}

fun main() {
    val solution = Solution52()
    val result = solution.isPalindrome("A man, a plan, a canal: Panama")
    print(result)
}