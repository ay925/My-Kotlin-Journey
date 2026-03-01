package DSA.Classes

fun main() {
    val nums=listOf(1,3,4,5,6,7,8,9,10,14,18,30)
    val n=nums.size
    val target=2
    var low=0
    var high=n-1
    var ans=n
    while (low<=high){
        val mid=(low+high)/2
        if (nums[mid]>=target){
            ans=mid
            high=mid-1
        }
        else low=mid+1
    }
    println(ans)
}