package dsa.dsa_master_Sheet

class Solution15 {
    fun sortColors(nums: IntArray): Unit{
        val n = nums.size

        var l=0
        var m=0
        var h = n-1

        while (m<=h){
            if (nums[m]==0){
                val temp = nums[l]
                nums[l]=nums[m]
                nums[m]=temp
                l++
                m++
            }else if (nums[m]==2){
                val temp = nums[h]
                nums[h]=nums[m]
                nums[m]=temp
                h--
            }else{
                m++
            }
        }
        print(nums.contentToString())
    }
}

fun main() {
    val solution = Solution15()
    val result = solution.sortColors(intArrayOf(0,0,1,1,2,2,2,2)) // [2 , 0 , 2 , 1 , 1 , 0]
    print(result)
}