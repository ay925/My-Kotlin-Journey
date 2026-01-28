package DSA

//Head Recursion
var count=0
fun greet(){
    if (count>=4){
        return
    }
    count++
    println("hello Anupam")
    greet()

}
//Tail Recursion
var count2=0
fun greet2(){
    if (count2>=4){
        return
    }
    count2++
    greet()
    println("hello Anupam")

}

fun main() {
    greet2()
}