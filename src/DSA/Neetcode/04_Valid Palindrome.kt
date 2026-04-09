package DSA.Neetcode

class Solution04 {
    fun isPalindrome(s: String): Boolean {
        val sCleaned=s.replace(Regex("[^A-Za-z]"), "").lowercase()
        val n=sCleaned.length
        var left=0
        var right=n-1
        while (left<=right){
            if (sCleaned[left]!=sCleaned[right]){
                return false
            }
            left++
            right--
        }
        return true
    }
}
fun main() {
    val answer= Solution04()
    print(answer.isPalindrome("Was it a car or a cat I saw?"))
}
