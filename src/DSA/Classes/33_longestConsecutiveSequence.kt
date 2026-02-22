package DSA.Classes
/*
fun main() {
    val nums=listOf(1,99,101,98,2,5,3,100)
    val n=nums.size
    var max_count= 0
    for (i in 0 until n){
        var num=nums[i]
        var count=1
        while (num+1 in nums){
            num++
            count++
        }
        if (count>max_count){
            max_count=count
        }
    }
    println(max_count)

}

 */

fun main() {
    val num=listOf(1,99,101,98,2,5,3,100)
    val nums=num.sorted()
    var count=0
    val n=nums.size
    var last_smallest= Int.MIN_VALUE
    var langest=0
    for (i in 0 until n){
        val num=nums[i]
        if (num-1==last_smallest){
            count++
            last_smallest=num
        }else if(num-1 !=last_smallest){
            count=1
            last_smallest=num
        }
        if (count>langest){
            langest=count
        }
    }
    println(langest)


}