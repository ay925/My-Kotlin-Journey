package DSA.Leetcode

 class Solution {
    fun isPalindrome(x: Int): Boolean {
        var revn=0
        var num=x
        while(num>0){
            val ld=num%10
            revn*=10
            revn+=ld
            num/=10
        }
        if(revn==x){
            return true
        }else{
            return false
        }
    }
}

fun main() {
    val number= Solution()
    print(number.isPalindrome(121))
}