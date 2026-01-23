
//Arithmetic Operators
fun main() {
    val a=16
    val b=3
    println("Addition $a and $b is: ${a+b}")
    println("Substraction $a and $b is: ${a-b}")
    println("Multiplication $a and $b is: ${a*b}")
    println("Division of $a and $b is: ${a/b.toDouble()}")
    println("Modulo $a and $b is: ${a%b}")
//Assignment Operators
    var x=10
    x+=10
    println("(x+=10)=$x")
    x-=10
    println("(x-=10)=$x")
    x*=10
    println("(x*=10)=$x")
    x/=10
    println("(x/=10)=$x")
    x%=10
    println("(x%=10)=$x")
// Relational Operators
    val i=10
    val j=10
    println("i>j=${i>j}")
    println("i<j=${i<j}")
    println("i>=j=${i>=j}")
    println("i<=j=${i<=j}")
    println("i==j=${i==j}")
    println("i!=j=${i!=j}")
//Logical Operators
    val l=10
    val m=20
    val n=30
    println("l>m && l>n ${l>m && l>n}")
    println("l>m || l>n ${l>m || l>n}")
    println("!(l>m) ${!(l>m)}")
//Increment and Decrement Operators
    var v=10
    println("(++v)=${++v}") //Pre increment
    println("(--v)=${--v}") //Pre decrement
    println("(v++)=${v++}") //Post increment
    println("(v--)=${v--}") //Post decrement
}