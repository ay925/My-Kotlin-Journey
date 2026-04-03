package DSA.Leetcode

class Solution10 {
    fun maxProfit(prices: IntArray): Int {
       val n=prices.size
        var maxProfit= 0
        var buy=prices[0]
        for (i in 1 until  n){
            val sell=prices[i]
            val profit=prices[i]-buy
            if (buy>sell) buy=sell
            if (maxProfit<profit) maxProfit=profit
        }
        return maxProfit
    }
}
fun main() {
    val answer= Solution10()
    print(answer.maxProfit(intArrayOf(7,1,5,3,6,4)))
}