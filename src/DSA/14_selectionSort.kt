package DSA

fun main(){
    val nums=mutableListOf(5,4,6,8,3,9,1,7,4)
    val n=nums.size
    for(i in 0 until n){
        var min_index=i
        for(j in i+1 until n){
            if(nums[min_index]>nums[j]){
                min_index=j
            }
        }
        var temp=nums[min_index]
        nums[min_index]=nums[i]
        nums[i]=temp
    }
    println(nums)
}