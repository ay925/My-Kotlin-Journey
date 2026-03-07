package DSA.Leetcode

import kotlin.math.pow

class Solution39 {
    fun myPow(x: Double, n: Int): Double {
        return x.pow(n.toDouble())
    }
}

fun main() {
    val q = Solution39()
    println(q.myPow(2.000,-2))
}