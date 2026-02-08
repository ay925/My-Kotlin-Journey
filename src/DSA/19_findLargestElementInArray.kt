package DSA

fun main() {
    val nums=listOf(-1,-2,-3,-4,-5,-6,-7,-8,-55,-66,-2,-23,)
    val n=nums.size
    var minValue=nums[0]
    for (i in 0 until n){
        if (minValue<nums[i]){
            minValue=nums[i]
        }
    }
    println(minValue)
}