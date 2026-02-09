package DSA.Classes

fun mergeArr(left: List<Int>, right: List<Int>): List<Int>{
    val result=mutableListOf<Int>()
    var i=0
    var j=0
    val m=left.size
    val n=right.size
    while (i<m && j<n){
        if (left[i]<=right[j]){
            result.add(left[i])
            i++
        }else{
            result.add(right[j])
            j++
        }
    }
    if (i<m){
        while (i<m){
            result.add(left[i])
            i++
        }
    }else{
        while (j<n){
            result.add(right[j])
            j++
        }
    }
    return result
}

fun mergeSort(arr: List<Int>): List<Int>{
    if (arr.size<=1){
        return arr
    }
    val mid=arr.size/2
    val leftArr=arr.subList(0,mid)
    val rightArr=arr.subList(mid,arr.size)
    val left=mergeSort(leftArr)
    val right=mergeSort(rightArr)
    return mergeArr(left,right)
}
fun main() {
    println(mergeSort(listOf(3,1,6,4,4,2,1)))
}
