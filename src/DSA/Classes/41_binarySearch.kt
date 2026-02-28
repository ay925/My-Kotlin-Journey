package DSA.Classes

fun main() {
    val nums=listOf(-1,0,3,5,9,12)
    val n=nums.size
    val target=9
    var low=0
    var high=n-1
    var ans=-1
    while (low<=high){
        val mid=(low+high)/2
        if (nums[mid]==target){
            ans=mid
            break
        }
        else if (nums[mid]<target) low=mid+1
        else high=mid-1
    }
    println(ans)

}