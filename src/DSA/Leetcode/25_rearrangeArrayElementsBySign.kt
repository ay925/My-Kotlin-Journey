package DSA.Leetcode

class Solution25 {
    fun rearrangeArray(nums: IntArray): IntArray {
        val m=nums.size
        val result= IntArray(m){0}
        var p=0
        var n=1
        for (i in 0 until m){
            if (nums[i]>0){
                result[p]=nums[i]
                p+=2
            }else{
                result[n]=nums[i]
                n+=2
            }
        }
        return result
    }
}

fun main() {
    val q= Solution25()
    println(q.rearrangeArray(intArrayOf(5,10,-3,-1,-10,6)))
}