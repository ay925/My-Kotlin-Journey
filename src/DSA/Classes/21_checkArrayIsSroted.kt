package DSA.Classes

fun main() {
    val nums=arrayOf(1,2,3,5,8,10,12,15,16)
    val n =nums.size
    var result=true
    for(i in 1 until n){
        if(nums[i-1]>nums[i]){
            result=false
            break
        }
    }
    print (result)
}