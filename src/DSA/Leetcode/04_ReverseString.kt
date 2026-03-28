package DSA.Leetcode

class Solution04 {
    fun reverseString(s: CharArray): Unit {
        val n=s.size
        var l=0
        var r=n-1
        while (l<=r){
            val temp=s[l]
            s[l]=s[r]
            s[r]=temp
            l++
            r--
        }
        println(s)
    }
}
fun main() {
    val answer= Solution04()
    answer.reverseString(charArrayOf('h','e','l','l','o'))
}