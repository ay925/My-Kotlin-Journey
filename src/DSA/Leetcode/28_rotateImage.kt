package DSA.Leetcode


class Solution28 {
    fun rotate(matrix: Array<IntArray>): Unit {
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
        }

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