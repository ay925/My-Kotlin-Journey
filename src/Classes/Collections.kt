package Classes

fun main() {
//    val list=listOf(1,2,3,4,5)
    val list=mutableListOf(1,2,3,4,5)
    println(list)
    println(list.contains(6))
    println(list[0])
    list[0]=5
    println(list)
    val list1=listOf(1,2,3,4,5,10)
    list.addAll(list1)
    println(list1)

}