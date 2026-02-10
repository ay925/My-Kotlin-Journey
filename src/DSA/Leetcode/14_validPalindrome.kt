package DSA.Leetcode

class Solution14 {
    fun isPalindrome(s: String): Boolean {
        var str=s.replace(Regex("[^a-zA-Z0-9]"), "")
        return str.lowercase().reversed()==str.lowercase()
    }
}
fun main(){
    val q=Solution14()
    print(q.isPalindrome("0P"))
}