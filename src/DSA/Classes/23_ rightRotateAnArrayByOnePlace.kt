package DSA.Classes

fun main() {
    val nums=mutableListOf(7,3,2,4,5,6,8,0,8,2,3)
    val n=nums.size
    val temp=nums[n-1]
    for (i in n-1 downTo 1){
        nums[i]=nums[i-1]
    }
    nums[0]=temp
    println(nums)
}