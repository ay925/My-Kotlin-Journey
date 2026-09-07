package dsa.dsa_master_Sheet

class Solution50{
    fun firstAlphabet(s: String): String{
        val s = s.trim()
        val n = s.length
        var firstLetter=""
        firstLetter+=s[0]
        for (i in 0 until n){
            if (s[i]==' ' &&s[i+1] !=' '){
                firstLetter+=s[i+1]
            }
        }
        return firstLetter
    }
}

fun main() {
    val solution = Solution50()
    val result = solution.firstAlphabet("g eeks for ge eks")
    print(result)
}