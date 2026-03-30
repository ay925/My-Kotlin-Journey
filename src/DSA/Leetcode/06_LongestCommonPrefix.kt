package DSA.Leetcode

class Solution06 {
    fun longestCommonPrefix(strs: Array<String>): String {
        val strSorted=strs.sortedArray()
        val n=strSorted.size
        var longestCommonPrefix=""
        val strLength=strSorted[0].length
        val firstElement=strSorted[0]
        val lastElement=strSorted[n-1]
        var i=0
        while (i<strLength &&firstElement[i]==lastElement[i]){
            longestCommonPrefix+=firstElement[i]
            i+=1
        }
        return longestCommonPrefix
    }
}

fun main() {
    val answer= Solution06()
    print(answer.longestCommonPrefix(arrayOf("dog","racecar","car")))
}