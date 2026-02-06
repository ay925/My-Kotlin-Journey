package DSA.Leetcode

import kotlin.math.sqrt

class Solution10 {
    fun mySqrt(x: Int): Int {
        var low=1
        var high=x
        var ans=0
        while (low<=high){
            val mid: Long=(low.toLong()+high.toLong())/2
            val sqr: Long=mid*mid
            if (sqr==x.toLong()){
                return mid.toInt()
            }
            else if(sqr<x){
                ans=mid.toInt()
                low=mid.toInt()+1
            }
            else{
                high=mid.toInt()-1

            }
        }
        return ans

    }
}

fun main() {
    val q= Solution10()
    println(q.mySqrt(16))
}