package DSA.Classes

//Brute force approach
/*
fun main() {
    val nums=listOf(5,10,-3,-1,-10,6)
    val m=nums.size
    val p=mutableListOf<Int>()
    val n=mutableListOf<Int>()
    val result=mutableListOf<Int>()

    for (i in 0 until m){
        if (nums[i]>0){
            p.add(nums[i])
        }else{
            n.add(nums[i])
        }
    }

    val x =p.size
    for (j in 0 until x){
        result.add(p[j])
        result.add(n[j])
    }
    println(result)

}

 */
// optimal approach

fun main() {
    val nums=listOf(5,10,-3,-1,-10,6)
    val m=nums.size
    val result=MutableList(m){0}
    var p=0
    var n=1
    for (i in 0 until m){
        if (nums[i]>0){
            result[p]=nums[i]
            p+=2
        }else{
            result[n]=nums[i]
            n+=2
        }
    }
    println(result)

}

