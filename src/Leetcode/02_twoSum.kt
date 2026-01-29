package Leetcode

class Solution2{
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for(i in 0 until nums.size){
            for(j in i+1 until nums.size){
                if(nums[i]+nums[j]==target){
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }
}
fun main(){
    val q = Solution2()
    val result = q.twoSum(intArrayOf(3,3), 6)
    println(result.contentToString())
}