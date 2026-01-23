package project

fun main() {
    var num=1232
    var count=0
    while(num>0){
        count++
        num/=10
    }
    println("Count Number is $count")
}
