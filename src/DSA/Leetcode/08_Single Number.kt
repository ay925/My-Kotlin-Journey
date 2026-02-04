package DSA.Leetcode

class Solution8 {
    fun singleNumber(nums: IntArray): Int {
        val n=nums.size
        var result=0
        for (i in 0 until n){
            result=result xor nums[i]
        }
        return result
    }
}

fun main() {
    val q= Solution8()
    println(q.singleNumber(intArrayOf(4,1,2,1,2)))
}