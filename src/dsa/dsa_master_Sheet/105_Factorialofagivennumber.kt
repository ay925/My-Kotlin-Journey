package dsa.dsa_master_Sheet

class Solution105{
    fun factorial(n: Int): Int{
        if (n <=1) return 1
        return n* factorial(n-1)
    }
}

fun main() {
    val solution = Solution105()
    val result =solution.factorial(5)
    println(result)
}