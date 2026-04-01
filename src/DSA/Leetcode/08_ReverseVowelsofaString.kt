package DSA.Leetcode

class Solution08 {
    fun reverseVowels(s: String): String {
        val s=s.toCharArray()
        val vowels=listOf('A','a','E','e','I','i','O','o','U','u')
        val n = s.size
        var left=0
        var right=n-1
        while (left<=right) {
            if (s[left] !in vowels && s[right] !in vowels){
                left++
                right--
            }
            else if (s[left] in vowels && s[right] in vowels){
                val temp=s[left]
                s[left]=s[right]
                s[right]=temp
                left++
                right--
            }
           else if (s[left] !in vowels) {
                left++
            }
            else if (s[right] !in vowels){
                right--
            }
        }

        return s.concatToString()
    }
}

fun main() {
    val answer= Solution08()
    print(answer.reverseVowels("leetcode"))
}