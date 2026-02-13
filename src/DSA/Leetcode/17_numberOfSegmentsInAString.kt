package DSA.Leetcode


class Solution17 {
    fun countSegments(s: String): Int {
        val str = s.trim()
        if (str.isEmpty()) return 0

        var count = 1
        for (i in 1 until str.length) {
            if (str[i] != ' ' && str[i - 1] == ' ') {
                count++
            }
        }
        return count
    }
}
fun main(){
    val q=Solution17()
    print(q.countSegments(", , , ,        a, eaefa"))
}