package dsa.self

class Solution04 {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val n=nums.size
        val expectedNums=mutableListOf<Int>()
        var i=0
        var j=0
        while (i<n){
            if (nums[i]==`val`){
                i+=1
            }else{
                nums[j]=nums[i]
                expectedNums.add(nums[i])
                j+=1
                i+=1
            }
        }
        return expectedNums.size
    }
}

fun main() {
    val ans= Solution04()
    ans.removeElement(intArrayOf(0,1,2,2,3,0,4,2),2)
}