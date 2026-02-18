package DSA.Classes

fun main(){
    val nums=listOf(1,0,1,0,0,1,1,1,1,0,1,1)
    val n=nums.size
    var a= 0
    var result=0
    for(i in 0 until n){
        if(nums[i]==1){
            a++
        }
        else{
            if(a>result){
                result=a
            }
            a=0
        }
    }
    if(a>result){
        result=a
    }
    print(result)
}