package DSA

fun main() {
    var n=listOf(5,3,2,2,1,5,5,7,5,10)
    var m=listOf(10,101,9,5,67,27,2)
    val frequency_map= mutableMapOf<Int, Int>()
    for (i in m){
        var count=0
        for (j in n){
            if (i !in n){
                frequency_map[i]=0
            }
            else if (i==j){
                count++
                frequency_map[i]=count
            }
        }
    }
    println(frequency_map)

     n=listOf(5,3,2,2,1,5,5,7,5,10)
     m=listOf(10,101,9,5,67,27,2)


    val list = MutableList(11) { 0 }
    println(list)
    for (i in n){
        list[i]+=1
    }
    for (j in m){
        if (j<1 || j>10){
            print("${0} ")
        }
        else{
            print("${list[j]} ")
        }
    }
    print("\n")
    val s="azzcmnseendwwym"
    val q=listOf('d','m','n','c','~')
    val listch = MutableList(26) { 0 }
    for (i in s){
        val accai_value=i.code
        val index=accai_value-97
        listch[index]+=1
    }
    for (j in q){
        val accai_value=j.code
        val index=accai_value-97
        if (accai_value<97 || accai_value>122){
            print("${0} ")
        }
        else{
            print("${listch[index]} ")
        }
    }



}