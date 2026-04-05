package DSA.Leetcode

class Solution12 {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0

        for (i in 0..haystack.length - needle.length) {
            var j = 0
            while (j < needle.length && haystack[i + j] == needle[j]) {
                j++
            }
            if (j == needle.length) {
                return i
            }
        }
        return -1
    }
}

fun main() {
    val answer= Solution12()
    print(answer.strStr("anupam",""))
}
//aaaaa
//bba