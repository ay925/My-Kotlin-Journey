package dsa.self

import kotlin.math.pow

class Solution15 {
    fun myPow(x: Double, n: Int): Double {
        return x.pow(n.toDouble())
    }
}

fun main() {
    val ans = Solution15()
    println(ans.myPow(2.00000, 10))
}