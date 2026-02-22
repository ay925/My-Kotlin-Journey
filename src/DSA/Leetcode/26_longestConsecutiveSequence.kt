package DSA.Leetcode

class Solution26 {
    fun longestConsecutive(nums: IntArray): Int {
        val nums2=nums.sorted()
        var count=0
        val n=nums2.size
        var lastSmaller= Int.MIN_VALUE
        var langest=0
        for (i in 0 until n){
            val num=nums2[i]
            if (num==lastSmaller){
                continue
            }
            if (num-1==lastSmaller){
                count++
                lastSmaller=num
            }else if(num-1 !=lastSmaller){
                count=1
                lastSmaller=num
            }
            if (count>langest){
                langest=count
            }
        }
        return langest
    }
}