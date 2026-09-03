package self_learning


fun main() {
    val arr = mutableListOf<Int>()
    var top = 0 -1
    fun push(item: Int){
        top++
        arr.addLast(item)
    }
    fun pop(){
        arr.removeLast()
    }

    push(2)
    println(arr)
    pop()
    println(arr)
    push(3)
    println(arr)
    push(3)
    push(3)
    println(arr)
}