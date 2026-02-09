package Classes

//if else elseif
fun main() {
//    val a=20
//    val b=40
//    if(a>b){
//        println("$a is greatest number")
//    }else{
//        println("$b is greatest number")
//    }
//    println(if (a>b) a else b)
//    print("Enter the marks : ")
//    val marks=readln().toInt()
//    if (marks>=90){
//        println("Grade Classes.A")
//    }else if(marks>=75){
//        println("Grade Classes.B")
//    }else if(marks>=60){
//        println("Grade C")
//    }else if(marks>=35){
//        println("Grade D")
//    }else{
//        println("Fail")
//    }
//    println(if (marks>60) "Excellent" else if(marks>40) "Average" else "Poor")




//when
//    val a=20
//    val b=40
//    val opr=readln()
//    val c =when(opr){
//        "Classes.add"->a+b
//        "sub"->a-b
//        "mul"->a*b
//        "div"->a/b
//        else -> "Wrong operation"
//    }
//    println(c)
//    val a=readln().toInt()
//    when(a){
//        11,12->println("Number is 11 or 12")
//        13->println("Number is 13")
//        14->println("Number is 14")
//        15->println("Number is 15")
//        in 16..100->{
//            println("Number between 16 to 100")
//        }
//        else -> {
//            println("wrong number")
//        }
//
//    }
    val a=readln().toInt()
    val b=readln().toInt()
    when{
        a>b->println("a is greater")
        a<b->println("b is greater")
        else->println("Equal")
    }
}
