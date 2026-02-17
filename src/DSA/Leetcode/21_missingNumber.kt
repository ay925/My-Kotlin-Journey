package DSA.Leetcode

class Solution21 {
    fun missingNumber(nums: IntArray): Int {
        val n=nums.size
        var sumOfNums=0
        var sumOfIteration=0
        for(i in 0..n){
            sumOfIteration+=i
        }
        for(j in nums){
            sumOfNums+=j
        }
        val result= sumOfIteration-sumOfNums
        return result
    }
}