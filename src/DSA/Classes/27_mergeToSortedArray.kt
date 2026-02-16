package DSA.Classes

fun main(){
    val nums1=listOf(1,1,1,2,4,6)
    val nums2=listOf(1,2,3,6,7,8,9,10)
    val merge_nums=mutableListOf<Int>()
    val n=nums1.size
    val m=nums2.size
    val freq_map=mutableMapOf<Int,Int>()
    for(i in 0 until n){
        freq_map[nums1[i]]=0
    }
    for(j in 0 until m){
        freq_map[nums2[j]]=0
    }
    for(k in freq_map.keys){
        merge_nums.add(k)
    }
    merge_nums.sort()
    print(merge_nums)
}