package DSA

import kotlin.math.sqrt

fun main() {
    val number = 10
    val n=number
    val factor_list=mutableListOf<Int>()
    for(i in 1..sqrt(n.toDouble()).toInt()){
        if(n%i==0){
            factor_list.add(i)
            if (i!=n/i){
                factor_list.add(n/i)
            }
        }
    }
    factor_list.sort()
    print(factor_list)
}