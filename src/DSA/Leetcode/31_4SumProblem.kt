package DSA.Leetcode

class Solution31 {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {

        val sorted = nums.sorted()
        val n = sorted.size
        val result = mutableListOf<List<Int>>()
        val targetLong = target.toLong()

        for (i in 0 until n - 3) {

            if (i > 0 && sorted[i] == sorted[i - 1]) continue

            if (sorted[i].toLong() + sorted[i+1] + sorted[i+2] + sorted[i+3] > targetLong) break
            if (sorted[i].toLong() + sorted[n-1] + sorted[n-2] + sorted[n-3] < targetLong) continue

            for (j in i + 1 until n - 2) {

                if (j > i + 1 && sorted[j] == sorted[j - 1]) continue

                var left = j + 1
                var right = n - 1

                while (left < right) {

                    val sum = sorted[i].toLong() +
                            sorted[j] +
                            sorted[left] +
                            sorted[right]

                    when {
                        sum == targetLong -> {
                            result.add(
                                listOf(
                                    sorted[i],
                                    sorted[j],
                                    sorted[left],
                                    sorted[right]
                                )
                            )

                            left++
                            right--

                            while (left < right && sorted[left] == sorted[left - 1]) left++
                            while (left < right && sorted[right] == sorted[right + 1]) right--
                        }

                        sum < targetLong -> left++
                        else -> right--
                    }
                }
            }
        }

        return result
    }
}
fun main(){
    val q=Solution31()
    print(q.fourSum(intArrayOf(1000000000,1000000000,1000000000,1000000000),-294967296))
}