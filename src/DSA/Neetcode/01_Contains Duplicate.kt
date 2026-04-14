package DSA.Neetcode


class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val frequencyOfNumbers=mutableMapOf<Int, Int>()
        for (i in nums){
            var count=1
            if (i !in frequencyOfNumbers.keys){
                frequencyOfNumbers[i]= 1
            }else{
                count++
                frequencyOfNumbers[i]=count
            }
        }
        for (i in frequencyOfNumbers.values){
            if (i>1) return true
        }
        return false
    }
}
fun main() {
    val answer= Solution()
    print(answer.hasDuplicate(intArrayOf(1, 2, 3, 4)))
}