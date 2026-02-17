package DSA.Classes

fun main(){
    val nums=listOf(3,0,1)
    val n=nums.size
    var sumOfNums=0
    var sumOfIteration=0
    for(i in 0..n){
        sumOfIteration+=i
    }
    for(j in nums){
        sumOfNums+=j
    }
    val result= sumOfIteration-sumOfNums
    print(result)
}