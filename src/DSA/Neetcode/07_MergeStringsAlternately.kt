package DSA.Neetcode

class Solution07 {
    fun mergeAlternately(word1: String, word2: String): String {
        var s=""
        var i=0
        var j=0
        while (i<word1.length || j<word2.length){
            if (i<word1.length && j<word2.length) {
                s += word1[i]
                s += word2[j]
                i++
                j++
            }
            else if (i==word1.length){
                while (j<word2.length){
                    s+=word2[j]
                    j++
                }
            }
            else if(j==word2.length){
                while (i<word1.length){
                    s+=word1[i]
                    i++
                }
            }
        }
        return s
    }
}

fun main() {
    val answer= Solution07()
    print(answer.mergeAlternately("ab","abbxxc"))
}
