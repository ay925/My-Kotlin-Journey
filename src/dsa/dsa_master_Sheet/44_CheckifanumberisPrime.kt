package dsa.dsa_master_Sheet

import kotlin.math.sqrt

class Solution44{
    fun isPrime(number: Int): Boolean{
        if (number==1){
            return false
        }
        for (i in 2..sqrt(number.toDouble()).toInt()){
            if (number%i==0){
                return false
            }
        }
        return true
    }
}

fun main() {
    val solution = Solution44()
    val result = solution.isPrime(7)
    print(result)
}