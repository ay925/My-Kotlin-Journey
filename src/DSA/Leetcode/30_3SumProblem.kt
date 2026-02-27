package DSA.Leetcode

class Solution30 {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val n=nums.size
        val result = mutableListOf<List<Int>>()
        for (i in 0 until n){
            for(j in i+1 until n){
                for (k in j+1 until n){
                    if (nums[i]+nums[j]+nums[k]==0){
                        val temp= listOf(nums[i],nums[j],nums[k]).sorted()
                        if (temp !in result){
                            result.add(temp)
                        }
                    }
                }
            }

        }
        return result
    }
}
