package DSA

fun factorial(n:Int):Int{
    if(n==1 || n==0){
        return 1
    }
    return n*factorial(n-1)
}
fun main(){
    println(factorial(10))
}