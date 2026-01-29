package DSA

fun func(x: Int,n:Int){
    if (n<=0){
        return
    }
    println(x)
    func(x,n-1)
}
// Print 1 to n
// Head Recursion
fun func2(x: Int,n:Int){
    if (x>n){
        return
    }
    println(x)
    func2(x+1,n)
}
//Print 1 to n
//Tail Recursion

fun func3(x: Int,n:Int){
    if (x>n){
        return
    }
    func3(x+1,n)
    println(n-(x-1))

}
fun main() {
//    func(1,4)
//    func2(1,4)
    func3(1,4)

}