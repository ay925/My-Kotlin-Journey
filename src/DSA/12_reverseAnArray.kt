package DSA

fun reverseAnArray(arr: IntArray,left:Int,right:Int): IntArray{
    if (left>=right){
        return arr
    }
    val temp=arr[right]
    arr[right]=arr[left]
    arr[left]=temp
    return reverseAnArray(arr,left+1,right-1)
}

fun main() {
    println(reverseAnArray(intArrayOf(1,2,3,4,5,6,7,8,9,0),0,9).joinToString(prefix = "[", postfix = "]"))
}