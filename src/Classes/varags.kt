package Classes

fun main() {
//    printIntegers(12,3,3,3,3,3)
    val result=sum(2,3,5,13)
    println(result)
    val a=intArrayOf(2,3,4,5,6,7,8)
    printIntegers(*a)
}
fun printIntegers(vararg number: Int){
    for (i in number){
        println(i)
    }
}
fun sum(vararg number: Int):Int{
    var totalSum=0
    for (i in number){
        totalSum+=i
    }
    return totalSum
}