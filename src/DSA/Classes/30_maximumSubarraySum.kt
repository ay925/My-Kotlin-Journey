package DSA.Classes

//Brute force approach
/*
fun main() {
    val nums=listOf(-2,1,-3,4,-1,2,1,-5,4)
    val n = nums.size
    var maxi= Int.MIN_VALUE
    for (i in 0 until n){
        var total =0
        for (j in i until n){
            total+=nums[j]
            if (maxi<total){
                maxi=total
            }
        }
    }
    println(maxi)
}

 */
//Optimal approach

fun main() {
    val nums=listOf(-2,1,-3,4,-1,2,1,-5,4)
    var total =0
    val n = nums.size
    var maxi= Int.MIN_VALUE
    for (i in 0 until n){
        total+=nums[i]
        if (maxi<total){
            maxi=total
        }
        if (total<0){
            total=0
        }
    }
    println(maxi)
}