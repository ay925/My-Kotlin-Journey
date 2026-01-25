package DSA

//Number
fun main() {
    val number=1234321
    var num = number
    var revn=0
    while(num>0){
        val ld =num%10
        revn*=10
        revn+=ld
        num/=10
    }
    if (number==revn){
        println("Palindrome")
    }else{
        println("Not Palindrome")
    }
 //text
    val text="nitin"
    var revtext=""
    var n=text.length
    while (n>0){
        revtext+=text[n-1]
        n--
    }
    if (text==revtext){
        println("Palindrome")
    }else{
        println("Not Palindrome")
    }

}