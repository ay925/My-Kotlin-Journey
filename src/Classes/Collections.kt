package Classes

fun main() {
//    val list=listOf(1,2,3,4,5)
    val list=mutableListOf(1,2,3,4,5)
    println(list)
    println(list.contains(6))
    println(list[0])
    list[0]=5
    println(list)
    val list1=listOf(0,2,3,4,5,10)
    list.addAll(list1)
    println(list)


    val subjectSet=setOf("CS","Physics","Chemistry","Maths","Physics","Chemistry")
    println(subjectSet)

    val map =mapOf(1 to "Raj",2 to "Anupam")
    println(map)

    val mutableMap=mutableMapOf<Int, String>()
    mutableMap[1] = "Anupam"
    mutableMap[2]="Aditi"
    mutableMap[3]="Anu"
    println(mutableMap)
    for ((key,value) in mutableMap){
        println("$key : $value")
    }
}