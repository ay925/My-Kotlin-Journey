package dsa.dsa_master_Sheet

class Solution49{
    fun removeSpaces(s: String): String{
        var t =""
        val n = s.length
        for (i in 0 until n){
            if (s[i]!=' '){
                t+=s[i]
            }
        }

        return t
    }
}


fun main() {
    val solution = Solution49()
    val result = solution.removeSpaces("g eeks for ge eks")
    print(result)
}