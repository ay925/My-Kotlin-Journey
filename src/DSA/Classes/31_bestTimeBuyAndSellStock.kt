package DSA.Classes

// brute force approach
/*
fun main(){
    val nums=listOf(7,1,5,3,6,4)
    val n=nums.size
    var profit=0
    for(i in 0 until n){
        for(j in i+1 until n){
            val p=nums[j]-nums[i]
            if(profit<p){
                profit=p
            }
        }
    }
    print(profit)
}
*/
//optimal approach

fun main(){
    val nums=listOf(7,1,5,3,6,4)
    val n=nums.size
    var buy=nums[0]
    var profit=0
    for(i in 0 until n){
        if(nums[i]<buy){
            buy=nums[i]
        }
        if(profit<nums[i]-buy){
            profit=nums[i]-buy
        }
    }
    print(profit)
}