package dsa.dsa_master_Sheet

class Solution104{
    fun sumOfNaturalNumber(n: Int){
        val sum = n*(n+1)/2
        println(sum)
    }
}

fun main() {
    val solution = Solution104()
    solution.sumOfNaturalNumber(1000)
}