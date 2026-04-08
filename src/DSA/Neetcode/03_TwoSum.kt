package DSA.Neetcode

class Solution03 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val n=nums.size
        for (i in 0 until n){
            for(j in i+1 until n){
                if (nums[i]+nums[j]==target){
                    return intArrayOf(i,j)
                }
            }
        }
        return intArrayOf(0,0)
    }
}

fun main() {
    val answer= Solution03()
    print(answer.twoSum(intArrayOf(4,5,6),10).contentToString())
}
