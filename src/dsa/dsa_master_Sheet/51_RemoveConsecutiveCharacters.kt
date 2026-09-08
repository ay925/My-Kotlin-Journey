package dsa.dsa_master_Sheet

class Solution51{
    fun removeDuplicates(s: String): String{
        var ans =""
        val n = s.length
        for (i in 0 until n-1){
            if (s[i]!=s[i+1]) ans+=s[i]
        }
        ans+=s[n-1]
        return ans
    }
}

fun main() {
    val solution = Solution51()
    val result = solution.removeDuplicates("aabb")
    print(result)
}