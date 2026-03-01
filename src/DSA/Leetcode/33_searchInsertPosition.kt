package DSA.Leetcode

class Solution33 {
    fun searchInsert(nums: IntArray, target: Int): Int {
        val n=nums.size
        var low=0
        var high=n-1
        var ans=n
        while (low<=high){
            val mid=(low+high)/2
            if (nums[mid]>=target){
                ans=mid
                high=mid-1
            }
            else low=mid+1
        }
        return ans
    }
}