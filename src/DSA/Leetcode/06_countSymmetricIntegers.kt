package DSA.Leetcode

class Solution6 {
    fun countSymmetricIntegers(low: Int, high: Int): Int {
        var sum=0
        for (i in low..high){
            if (i in 10..99 && i%11==0){
                sum+=1
            }
            else if (i in 1000..9999){
                val first=(i/1000)
                val second=(i/100)%10
                val third=(i/10)%10
                val fourth=i%10
                val firstSecondSum=first+second
                val thirdFourthSum=third+fourth
                if (firstSecondSum==thirdFourthSum){
                    sum+=1
                }
            }
        }
        return sum
    }
}
fun main() {
    val q= Solution6()
    println(q.countSymmetricIntegers(1200,1230))
}