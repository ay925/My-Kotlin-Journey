package DSA.Leetcode

class Solution15 {
    fun removeDuplicates(nums: IntArray): Int {
        val n=nums.size
        var j=0
        var i=0
        while (j<n){
            if (nums[j]!=nums[i]){
                i++
                val temp=nums[i]
                nums[i]=nums[j]
                nums[j]=temp
            }
            j++
        }
    }
}