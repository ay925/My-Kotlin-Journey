package DSA.Classes

fun main() {
    val nums=listOf(1,2,3,4,3,2,1,4,5,6,7,8,9,9,0,1,2,2,23,3,9)
    val frequency_map= mutableMapOf<Int, Int>()
    for (i in nums){
        if (i !in frequency_map.keys ){
            frequency_map[i]=1
        }else{
            frequency_map[i] = frequency_map[i]!! + 1

        }
    }
    println(frequency_map)
}

