package DSA.Leetcode

class Solution07 {
    fun lengthOfLastWord(s: String): Int {
        val sTrimmed=s.trim()
        val n=sTrimmed.length
        var length=0
        if (sTrimmed.isEmpty()) return 0
        for (i in n-1 downTo 0){
            if (sTrimmed[i]==' ') {
                break
            }
           length++

        }
        return length
    }

}

fun main() {
    val answer= Solution07()
    print(answer.lengthOfLastWord("luffy is still joyboy"))
}