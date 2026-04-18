package Pattern

fun butterfly(n: Int,symbols: String="*"){
    for (i in 1..n){
        for (j in 1..i){
            print(symbols)
        }
//        Spaces
        for (k in 1..2*(n-i)+1){
            print(" ")
        }

        for (k in 1..i){
            print(symbols)
        }
        println()
    }

    for (i in n downTo 1){
        for (j in 1..i){
            print(symbols)
        }
//        Spaces
        for (k in 1..2*(n-i)+1){
            print(" ")
        }
        for (k in 1..i){
            print(symbols)
        }
        println()
    }
}
fun main() {
butterfly(5,"*")
}