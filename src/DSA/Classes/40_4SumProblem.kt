package DSA.Classes

fun main() {
    val nums=listOf(1000000000,1000000000,1000000000,1000000000).sorted()
    val n=nums.size
    val target =-294967296
    val result = mutableListOf<List<Int>>()
    for (i in 0 until n){
        if (i>0 && nums[i]==nums[i-1]) continue
        for (j in i+1 until n){
            if (j > i+1 && nums[j]==nums[j-1]) continue
            var k=j+1
            var l=n-1
            while (k < l) {
                val total = nums[i] + nums[j] + nums[k] + nums[l]

                when {
                    total == target -> {
                        result.add(listOf(nums[i], nums[j], nums[k], nums[l]))
                        k++
                        l--

                        while (k < l && nums[k] == nums[k - 1]) k++
                        while (k < l && nums[l] == nums[l + 1]) l--
                    }
                    total < target -> k++
                    else -> l--
                }
            }
        }
    }
    println(result)

}