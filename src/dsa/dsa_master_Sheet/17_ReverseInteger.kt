package dsa.dsa_master_Sheet

class Solution17 {
    fun reverse(x: Int): Any {
        var n = x
        var reverseN=0L
        while (n !=0){
           val ld = n%10
            reverseN*=10
            reverseN+=ld
            n/=10
        }
        return if (reverseN>= Int.MAX_VALUE || reverseN<= Int.MIN_VALUE) 0 else reverseN
    }
}

fun main() {
    val solution = Solution17()
    val result = solution.reverse(1534236469)
    print(result)
}