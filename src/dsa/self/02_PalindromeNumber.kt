package dsa.self

class Solution02 {
    fun isPalindrome(x: Int): Boolean {
        var number=x
        var revrseNumber=0
        while(number>0){
            val lastDigit=number%10
            revrseNumber*=10
            revrseNumber+=lastDigit
            number/=10
        }
        if(x==revrseNumber){
            return true
        }else{
            return false
        }
    }
}