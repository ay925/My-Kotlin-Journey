package DSA.Leetcode

class Solution09 {
    fun isPalindrome(s: String): Boolean {
        var sLower=s.lowercase()
        sLower= sLower.replace(Regex("[^A-Za-z0-9]"), "")
        val n=sLower.length
        var left=0
        var right=n-1
        while (left<=right){
            if (sLower[left]==sLower[right]) {
                left++
                right--
            }else{
                return false
            }
        }
        return true
    }
}
fun main() {
    val answer= Solution09()
    print(answer.isPalindrome(" "))
}