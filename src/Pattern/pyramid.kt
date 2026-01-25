package Pattern

fun main() {
    val n=10
    for (i in 1..n){
        for(j in 1..n-i){
            print(" ")
        }
        for(k in 1..i){
            print("* ")
        }
        print("\n")
    }
}