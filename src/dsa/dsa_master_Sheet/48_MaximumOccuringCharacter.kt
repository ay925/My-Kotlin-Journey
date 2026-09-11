package dsa.dsa_master_Sheet

class Solution48{
    fun getMaxOccurringChar(s: String): Char{
        val s=s.toList().sorted()
        val freq=mutableMapOf<Char, Int>()

        for (char in s){
            freq[char]=freq.getOrDefault(char,0)+1
        }
        var maxChar=' '
        var maxCount = Int.MIN_VALUE
        for ((k,v) in freq){
            if (v>maxCount){
                maxCount=v
                maxChar =k
            }
        }
        return maxChar
    }
}

fun main() {
    val solution = Solution48()
    val result = solution.getMaxOccurringChar("output")
    print(result)
}