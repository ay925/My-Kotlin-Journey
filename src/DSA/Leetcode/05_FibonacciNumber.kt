package DSA.Leetcode

// by using recursion
/*
class Solution05 {
    fun fib(n: Int): Int {
        if (n==0) return 0
        if (n==1) return 1
        return fib(n-1)+fib(n-2)
    }
}

fun main() {
    val answer= Solution05()
    print(answer.fib(7))
}

 */
//by using loop

class Solution05 {
    fun fib(n: Int): Int {
        var a =0
        var b=1
        var ans=0
        for (i in 0..n){
            ans=a
            val temp=b
            b+=a
            a=temp
        }
        return ans
    }
}

fun main() {
    val answer= Solution05()
    print(answer.fib(6))
}