package DSA

import kotlin.math.pow

fun main() {
    val number =153
    var n =number
    var result=0
    val l=number.toString().length
    while(n>0){
        val ld =n%10
        result+= ld.toDouble().pow(l.toDouble()).toInt()
        n/=10
    }
    if(number==result) {
        print("This is a Armstrong Number")
    }
    else {
        print("This is not a Armstrong Number")
    }
}

