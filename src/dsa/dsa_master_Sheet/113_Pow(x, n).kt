package dsa.dsa_master_Sheet

class Solution113 {
    fun myPow(x: Double, n: Int): Double {
        var p =x
        if(p==1.0 &&n>0) return 1.0 else if (p==-1.0 &&n<0) return -1.0 else if (p==-1.0 &&n%2==0) return 1.0
        if (n ==0) return 1.00 else if (n==Int.MIN_VALUE) return 0.0
        if (n>0) {
            repeat(n - 1) {
                p *= x
            }
        }else{
            var n =n
            n*=-1
            repeat(n - 1) {
                p *= x
            }
            return 1/p
        }
        return p
    }
}


fun main() {
    val solution = Solution113()
    val result =solution.myPow(-1.00,2147483647)
    println(result)
}