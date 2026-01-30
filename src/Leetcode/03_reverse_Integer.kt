package Leetcode

class Solution3 {
    fun reverse(x: Int): Int {
        var num=x
        var reverse=0
        while(num!=0){
            val ld=num%10
            if ((reverse>(Int.MAX_VALUE/10))||(reverse<(Int.MIN_VALUE/10))){
                return 0
            }
            reverse*=10
            reverse+=ld
            num/=10
        }
        return reverse
    }
}

fun main() {
    val q= Solution3()
    println(q.reverse(2147483647))
}