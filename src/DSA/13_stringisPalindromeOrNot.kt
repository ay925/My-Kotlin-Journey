package DSA

fun main() {
    val str="nitin"
    val n=str.length
    var revString=""
    for (i in n-1 downTo 0 ){
        revString+=str[i]
    }
    if (str==revString){
        println("Palindrome")
    }else{
        println("Not palindrome")
    }
}