package Classes

fun main() {
    /*
    val lambdaFunction1={ a: Int, b:Int->a+b}
    println(lambdaFunction1(2,4))
    val lambdaFunction2={ msg: String->
        println("Hello Anupam")
        println("Message is $msg")

    }
    lambdaFunction2("Hello sir")
    val lamdaMinus:(Int,Int)->Int={a,b->a-b}
    println(lamdaMinus(2,3))
    val squareLambda:(Int)->Int={it->it*it}
    println(squareLambda(2))
     */
    arithmeticOpr(2,3) { x, y -> x + y }
    arithmeticOpr(2,3) { x, y -> x - y }
    arithmeticOpr(2,3) { x, y -> x * y }
    arithmeticOpr(2,3) { x, y -> x / y }
    arithmeticOpr(2,3) { x, y -> x % y }
}
fun arithmeticOpr(a:Int,b:Int,fn:(Int, Int)->Int){
    val result=fn(a,b)
    println("Result is $result")
}