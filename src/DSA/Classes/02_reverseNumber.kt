package DSA.Classes

fun main() {
    var num=1234311
    var revn=0
    while (num>0){
        val ld=num%10
        revn*=10
        revn+=ld
        num/=10
    }
    println("Reverse number is $revn")
}