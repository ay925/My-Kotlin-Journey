package dsa.dsa_master_Sheet

import kotlin.math.pow
import kotlin.math.sqrt

class Solution43{
    fun getDivisors(number: Int): List<Int>{

        var divior=mutableSetOf<Int>()
        for (i in 1..sqrt(number.toDouble()).toInt()){
            if (number%i==0){
                val m = number/i
                divior.add(i)
                divior.add(m)
            }
        }

        val diviorList=divior.sorted()
        return diviorList
    }
}

fun main() {
    val solution = Solution43()
    val result = solution.getDivisors(20)
    print(result)
}
