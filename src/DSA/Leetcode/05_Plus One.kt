package DSA.Leetcode

class Solution5 {
    fun plusOne(digits: IntArray): IntArray{
        val n=digits.size
        for (i in n-1 downTo 0){
            if (digits[i]<9){
                digits[i]++
                return digits
            }else{
                digits[i]=0
            }
        }
        val newArr = IntArray(n+ 1)
        newArr[0] = 1
        return newArr
    }
}
fun main() {
    val q= Solution5()
    println(q.plusOne(intArrayOf(9)).joinToString())
}