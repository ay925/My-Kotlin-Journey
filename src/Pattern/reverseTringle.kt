package Pattern

fun main() {
    val n=5
    for (i in 1 ..n){
        for (j in n downTo i){
            print("${n-j+1} ")
        }
        println()
    }
}
