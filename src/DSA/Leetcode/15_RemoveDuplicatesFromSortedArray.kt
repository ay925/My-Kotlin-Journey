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
        return i+1
    }
}

fun main(){
    val q=Solution15()
    print(q.removeDuplicates(intArrayOf(1,1,1,2,3,4,4,7,9,9,9,10)))
}