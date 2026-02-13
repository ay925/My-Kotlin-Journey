package DSA.Classes

fun reversed(nums:MutableList<Int>,l:Int, r:Int){
    var left=l
    var right=r
    while(left<=right){
        val temp=nums[left]
        nums[left]=nums[right]
        nums[right]=temp
        left++
        right--
    }
}
fun main() {
    val nums=mutableListOf(1,2,3,4,5,6,7,8,9)
    val n= nums.size
    val t=1
    val k=t%n
    reversed(nums,n-k,n-1)
    reversed(nums,0,n-k-1)
    reversed(nums,0,n-1)
    print(nums)
}