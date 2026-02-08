package DSA.Leetcode

class Solution12 {
    fun lengthOfLastWord(s: String): Int {
        val str=s.trim()
        val n=str.length
        var result=0
        for (i in n-1 downTo 0){
            if (str[i]== ' '){
                break
            }
            result+=1
        }
        return result
    }
}
fun main() {
    val q= Solution12()
    println(q.lengthOfLastWord("luffy is still joyboy"))
}
