package Classes

fun main() {
    println(square(3))
    val sq=::square
    println(sq(8))
    val a=10
    val b=50
    arithmeticOpr(a,b, ::add)
    arithmeticOpr(a,b, ::sub)
    arithmeticOpr(a,b, ::mul)
    arithmeticOpr(a,b, ::div)
    arithmeticOpr(a,b, ::rem)
}
fun square(num:Int):Int{
    return num*num
}
fun add(x:Int,y:Int):Int{
    return x+y
}
fun sub(x:Int,y:Int):Int{
    return x-y
}
fun mul(x:Int,y:Int):Int{
    return x*y
}
fun div(x:Int,y:Int):Int{
    return x/y
}
fun rem(x:Int,y:Int):Int{
    return x%y
}

fun arithmeticOpr(a:Int,b:Int,fn:(Int, Int)->Int){
    val result=fn(a,b)
    println("Result is $result")
}