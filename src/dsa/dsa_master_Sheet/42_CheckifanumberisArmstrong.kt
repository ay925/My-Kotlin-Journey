package dsa.dsa_master_Sheet

import kotlin.math.pow

class Solution42{
    fun armstrongNumber(number: Int): Boolean{
        val l = number.toString().length
        var n =number
        var armsNumber =0
        while (n!=0){
            val ld = n%10
            armsNumber+= ld.toDouble().pow(l.toDouble()).toInt()
            n /= 10
        }
        return armsNumber==number
    }
}

fun main() {
    val solution = Solution42()
    val result = solution.armstrongNumber(153)
    print(result)
}