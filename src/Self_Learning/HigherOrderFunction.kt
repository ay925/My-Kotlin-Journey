package Self_Learning



/*
fun add(a:Int,b: Int):Int{
    return a+b
}
fun sub(a:Int,b: Int):Int{
    return a-b
}
fun mul(a:Int,b: Int):Int{
    return a*b
}
fun div(a:Int,b: Int):Int{
    return a/b
}
fun rem(a:Int,b: Int):Int{
    return a%b
}
*/
fun operation(a: Int,b: Int,c:(String)-> Unit) {
     c("This is addtion")
}
fun main() {
    /*println(add(5,6))
    println(sub(5,6))
    println(mul(5,6))
    println(div(5,6))
    println(rem(5,6))*/
 /*   println(operation(a=5,b=6, c={a,b->
        a+b
    }))
    operation(a=5,b=6, c={a,b->
        a-b
    })
    operation(a=5,b=6, c={a,b->
        a*b
    })
    operation(a=5,b=6, c={a,b->
        a/b
    })
    operation(a=5,b=6, c={a,b->
        a%b
    })*/
    println(operation(5,6,{message->
        println(message)
    }))
}