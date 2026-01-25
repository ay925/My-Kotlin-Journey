fun main() {
//    println(add(2,3))
//    val addition= ::add
//    println(addition(1,2))
    println(add(1,2))
}
//fun add(a: Int,b:Int): Int{
//    return a+b
//}
//same as
//fun add(a:Int, b:Int):Int =a+b

//fun add(a:Int, b:Int=12):Int =a+b
//fun add(a:Int, b:Int=12)=a+b


//Function overloading
fun add(a:Int, b:Int):Int =a+b
fun add(a: Int,b: Int,c: Int)=a+b+c

