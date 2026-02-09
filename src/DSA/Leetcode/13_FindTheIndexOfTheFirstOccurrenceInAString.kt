package DSA.Leetcode

class Solution13 {
    fun strStr(haystack: String, needle: String): Int {
        var result =-1
        val n=haystack.length
        val m= needle.length
        for(i in 0 until n-m+1){
            for(j in 0 until m){
                if(haystack[i+j]!=needle[j]){
                    break
                }
                if(j==(m-1)){
                    return i
                }
            }
        }
        return result
    }
}
fun main(){
    val q=Solution13()
    print(q.strStr("sadbutsad","sad"))
}