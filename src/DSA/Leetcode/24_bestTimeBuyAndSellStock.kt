package DSA.Leetcode

class Solution24 {
    fun maxProfit(prices: IntArray): Int {
        val n=prices.size
        var buy=prices[0]
        var profit=0
        for(i in 0 until n){
            if(prices[i]<buy){
                buy=prices[i]
            }
            if(profit<prices[i]-buy){
                profit=prices[i]-buy
            }
        }
        return profit
    }
}