package DSA.Leetcode

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