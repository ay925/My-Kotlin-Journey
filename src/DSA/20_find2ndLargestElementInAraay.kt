package DSA

fun main(){
    val nums=listOf(55,32,97,55,45,32,88,21)
    var largest=nums[0]
    var seclargest=nums[0]
    val n=nums.size
    for(i in 0 until n){
        if(nums[i]>largest){
            seclargest=largest
            largest=nums[i]
        }
        else if(seclargest<nums[i] && nums[i]!=largest){
            seclargest=nums[i]
        }
    }
    print(seclargest)
}