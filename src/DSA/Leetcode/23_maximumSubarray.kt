package DSA.Leetcode

class Solution23 {
    fun maxSubArray(nums: IntArray): Int {
        var total =0
        val n = nums.size
        var maxi= Int.MIN_VALUE
        for (i in 0 until n){
            total+=nums[i]
            if (maxi<total){
                maxi=total
            }
            if (total<0){
                total=0
            }
        }
        return maxi
    }
}
fun main(){
    val q=Solution23()
    print(q.maxSubArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4)))
}