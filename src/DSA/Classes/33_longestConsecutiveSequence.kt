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
    val nums=listOf(1,99,101,98,2,5,3,100)
    val nums2=nums.sorted()
    var count=0
    val n=nums2.size
    var lastSmaller= Int.MIN_VALUE
    var langest=0
    for (i in 0 until n){
        val num=nums2[i]
        if (num==lastSmaller){
            continue
        }
        if (num-1==lastSmaller){
            count++
            lastSmaller=num
        }else if(num-1 !=lastSmaller){
            count=1
            lastSmaller=num
        }
        if (count>langest){
            langest=count
        }
    }
    println(langest)


}