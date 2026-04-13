package DSA.Neetcode

class Solution06 {
    fun lengthOfLastWord(s: String): Int {
        val sTrim=s.trim()
        var length=0
        for (i in sTrim.length-1 downTo 0){
            if (sTrim[i]==' ') break
            length++
        }
        return length
    }
}
fun main() {
    val answer= Solution06()
    print(answer.lengthOfLastWord("   fly me   to   the moon  "))
}