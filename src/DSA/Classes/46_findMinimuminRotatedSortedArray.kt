package DSA.Classes

import kotlin.math.min

fun main() {
    val nums=listOf(4,5,6,7,1,2,3)
    val n=nums.size
    var mini=nums[0]
    var low=0
    var high=n-1

    while (low<=high){
        val mid=(low+high)/2
        if (nums[mid]<=nums[high]){
            mini= min(mini,nums[mid])
            high=mid-1
        }
        else{
            mini= min(mini,nums[low])
            low=mid+1

        }
    }
    println(mini)
}