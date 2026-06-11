package dsa.self

class Solution07 {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val nums1 = nums1
        var i = m
        var j = 0
        while (i < nums1.size) {
            nums1[i] = nums2[j]
            i += 1
            j += 1
        }
        nums1.sort()
        println(nums1.contentToString())
    }
}