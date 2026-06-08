package dsa.self

class Solution03{
    fun removeDuplicates(nums: IntArray): Int {
        val expectedNums= mutableListOf<Int>()
        var i=0
        var j=1
        var k=0
        val n=nums.size
        while (i<n && j<n){
            if (nums[i]==nums[j]){
                j+=1
            }else{
                i=j
                nums[k]=nums[i-1]
                expectedNums.add(nums[k])
                j+=1
                k+=1
            }
        }
        nums[k]=nums[i]
        expectedNums.add(nums[i])
        println(nums.contentToString())
        println(expectedNums)
        return expectedNums.size
    }
}