package DSA.Classes

fun main() {
    val matrix=arrayOf(
        intArrayOf(1,2,3,4),
        intArrayOf(5,6,7,8),
        intArrayOf(9,10,11,12),
        intArrayOf(13,14,15,16)
    )
    val n= matrix.size

    for (i in 0 until n-1){
        for (j in i+1 until n){
            val temp=matrix[i][j]
            matrix[i][j]=matrix[j][i]
            matrix[j][i]=temp
        }
    }
    for (i in 0 until n){
        reverse(matrix[i])
    }
    for (i in 0 until n){
        for (j in 0 until n){
            print("${matrix[i][j]} ")
        }
        println()
    }

}
fun reverse(nums: IntArray){
    val n=nums.size
    var j =n-1
    var i=0
    while (i<=j){
        val temp=nums[i]
        nums[i]=nums[j]
        nums[j]=temp
        i++
        j--
    }

}