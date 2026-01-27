package DSA

fun main() {
    val n=listOf(5,3,2,2,1,5,5,7,5,10)
    val m=listOf(10,101,9,5,67,27,2)
    val frequency_map= mutableMapOf<Int, Int>()
    for (i in m){
        var count=0
        for (j in n){
            if (i !in n){
                frequency_map[i]=0
            }
            else if (i==j){
                count++
                frequency_map[i]=count
            }
        }
    }
    println(frequency_map)
}