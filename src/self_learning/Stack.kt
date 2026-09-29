package self_learning

import com.sun.java.accessibility.util.TopLevelWindowListener

private var TOP =-1
private const val SIZE =10


fun main() {
    val arr= IntArray(SIZE)

}

fun push(arr: IntArray,n: Int){
    if (isFull()){
        println("Stack Overflow")
    }else {
        TOP++
        arr[TOP] = n
    }
}

fun pop(arr: IntArray): Int{
    if (isEmpty()){
        println("Stack UnderFlow")
    }else {
        val n = arr[TOP]
        arr[TOP+1]=0
        TOP--
        return n
    }
    return -1
}

fun peek(): Int{
    return TOP
}
fun isEmpty(): Boolean{
    return TOP==-1
}

fun isFull(): Boolean{
    return TOP==SIZE-1
}