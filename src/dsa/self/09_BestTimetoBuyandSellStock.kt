package dsa.self

class Solution09 {
    fun maxProfit(prices: IntArray): Int {
        val n = prices.size
        var minPrice = Int.MAX_VALUE
        var maxProfit = Int.MIN_VALUE
        for (i in 0 until n) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]
            }
            val profit = prices[i] - minPrice
            if (profit > maxProfit) {
                maxProfit = profit
            }
        }
        return maxProfit
    }
}

fun main() {
    val ans = Solution09()
    println(ans.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
}