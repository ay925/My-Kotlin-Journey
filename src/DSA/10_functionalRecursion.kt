package DSA

fun sum(n:Int):Int{
    if(n<=0){
        return 0
    }
    return n+sum(n-1)
}
fun main() {
    println(sum(4))
}