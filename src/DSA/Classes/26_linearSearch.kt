package DSA.Classes

fun main(){
    val nums=listOf(1,2,3,4,2,5,6,8,8,9,7,5,4,4,4,6,7,8,9,9,8,5,4,6,7,8,9,9,6,5,7,7,7,7,6,6,7,7,6,9)
    val n=nums.size
    val target=9
    for(i in 0 until n){
        if(nums[i]==target){
            print(i)
            break
        }
    }
}