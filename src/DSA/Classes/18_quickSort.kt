package DSA.Classes

fun partition(nums: MutableList<Int>,low:Int,high:Int):Int{
    val pivot=nums[low]
    var i=low
    var j =high
    while (i<j){
        while (nums[i]<=pivot && i<=high-1){
            i++
        }
        while (nums[j]>=pivot &&i>=low+1){
            j--
        }
        if (i<j){
            val temp=nums[j]
            nums[j]=nums[i]
            nums[i]=temp
        }
    }
    val temp =nums[low]
    nums[low]=nums[j]
    nums[j]=temp
    return j
}

fun quick_sort(nums: MutableList<Int>,low:Int,high:Int): List<Int>{
    if (low<high){
        val p_ind=partition(nums,low,high)
        quick_sort(nums,low,p_ind-1)
        quick_sort(nums,p_ind+1,high)
    }
    return nums
}
fun main() {
    val nums=mutableListOf(3,1,2,4,7,8)
    val n=nums.size
    println(quick_sort(nums,0,n-1))
}