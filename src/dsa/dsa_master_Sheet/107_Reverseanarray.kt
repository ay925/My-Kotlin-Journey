package dsa.dsa_master_Sheet

class Solution107{
    fun reverseArray(arr: IntArray): IntArray{
        val n = arr.size
        var low =0
        var high = n-1

        while (high>low){
           val temp = arr[low]
            arr[low] = arr[high]
            arr[high] = temp
            low++
            high--
        }
        return arr
    }
}

fun main() {
    val solution = Solution107()
    val result =solution.reverseArray(intArrayOf(1, 4, 3, 2, 6, 5))
    println(result.contentToString())
}