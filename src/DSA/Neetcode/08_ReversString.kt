package DSA.Neetcode

class Solution08 {
    fun reverseString(s: CharArray) {
        val n=s.size
        var left=0
        var right=n-1
        while (left<=right){
           val temp=s[left]
            s[left]=s[right]
            s[right]=temp
            left++
            right--
        }
    }
}
