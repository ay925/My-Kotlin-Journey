package DSA.Leetcode

import kotlin.math.min

class Solution37 {
    fun findMin(nums: IntArray): Int {
        val n=nums.size
        var mini=nums[0]
        var low=0
        var high=n-1

        while (low<=high){
            val mid=(low+high)/2
            if (nums[mid]<=nums[high]){
                mini= min(mini,nums[mid])
                high=mid-1
            }
            else{
                mini= min(mini,nums[low])
                low=mid+1

            }
        }
        return mini
    }
}