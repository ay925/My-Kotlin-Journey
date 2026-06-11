package dsa.self

import kotlin.math.sqrt

class Solution08 {
    fun mySqrt(x: Int): Int {
        return sqrt(x.toDouble()).toInt()
    }
}

fun main() {
    val ans = Solution08()
    println(ans.mySqrt(8))
}