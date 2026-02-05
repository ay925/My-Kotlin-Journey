package DSA.Leetcode

class Solution9 {
    fun longestCommonPrefix(strs: Array<String>): String {
        var string=""
        if(strs.size==0){
            return string
        }
        val base=strs[0]
        val n=base.length
        for (i in 0 until n){
            for(word in strs.drop(1) ){
                if (i==word.length || word[i]!=base[i]){
                    return string
                }
            }
            string+=base[i]
        }
        return string
    }
}
fun main() {
    val q= Solution9()
    print(q.longestCommonPrefix(arrayOf("flower","flow","flight")))
}