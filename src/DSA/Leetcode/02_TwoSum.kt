package DSA.Leetcode

class Solution002 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val n=nums.size
        for (i in 0 until n ){
            for (j in i+1 until n){
                if (nums[i]+nums[j]==target){
                    return intArrayOf(i,j)
                }
            }
        }
        return intArrayOf()
    }
}
fun main() {
    val answer= Solution002()
    println(answer.twoSum(intArrayOf(3,3),6).joinToString())
}