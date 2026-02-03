package DSA.Leetcode

class Solution7 {
    fun countPairs(nums: List<Int>, target: Int): Int {
        val n=nums.size
        var result=0
        for(i in 0 until n){
            for (j in i+1 until n){
                val sum=nums[i]+nums[j]
                if(sum<target){
                    result+=1
                }
            }
        }
        return result
    }
}
fun main() {
    val q= Solution7()
    println(q.countPairs(listOf(-1,1,2,3,1),2))
}