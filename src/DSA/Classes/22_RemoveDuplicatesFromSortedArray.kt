package DSA.Classes

fun main() {
    val nums=mutableListOf(1,1,1,2,3,4,4,7,9,9,9,10)
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
    println(nums)
}