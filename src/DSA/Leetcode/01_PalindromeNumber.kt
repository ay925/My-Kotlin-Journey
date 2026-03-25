package DSA.Leetcode

class Solution01 {
    fun isPalindrome(x: Int): Boolean {
        val xStr=x.toString()
        val n=xStr.length
        var l=0
        var r=n-1
        while (l<=r){
            if (xStr[l]==xStr[r]){
                l+=1
                r-=1
            }else{
                return false
            }
        }
        return true
    }
}

fun main() {
    val answer= Solution01()
    println(answer.isPalindrome(121))
}
