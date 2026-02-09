package DSA.Classes

fun main() {
    val nums=mutableListOf(5,8,1,6,9,2,4)
    val n=nums.size
    for (i in n-2 downTo 0){
        for(j in 0..i){
            if(nums[j]>nums[j+1]){
                val temp =nums[j]
                nums[j]=nums[j+1]
                nums[j+1]=temp
            }
        }
    }
    println(nums)
}