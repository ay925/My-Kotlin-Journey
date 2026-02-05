package DSA

fun main(){
    val nums=mutableListOf(3,5,6,4,8,9,10,7,1)
    val n=nums.size
    for(i in 1 until n){
        var key=nums[i]
        var j=i-1
        while(j>=0 && nums[j]>key){
            nums[j+1]=nums[j]
            j--
        }
        nums[j+1]=key
    }
    println(nums)
}