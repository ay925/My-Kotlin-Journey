package DSA.Leetcode


class Solution22 {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        val n=nums.size
        var a= 0
        var result=0
        for(i in 0 until n){
            if(nums[i]==1){
                a++
            }
            else{
                if(a>result){
                    result=a
                }
                a=0
            }
        }
        if(a>result){
            result=a
        }
        return result
    }
}