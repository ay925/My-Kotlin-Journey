package DSA.Leetcode

class Solution18 {
    fun moveZeroes(nums: IntArray): Unit {
        val nums2=mutableListOf<Int>()
        val n=nums.size
        for(i in 0 until n ){
            if (nums[i]!=0){
                nums2.add(nums[i])
            }
        }
        val m =nums2.size
        for (j in 0 until m){
            nums[j]=nums2[j]
        }

        for (x in m until n){
            nums[x]=0
        }
    }
}
fun main(){
    val q=Solution18()
    print(q.moveZeroes(intArrayOf(1,0,2,4,3,0,0,3,5,1)))
}