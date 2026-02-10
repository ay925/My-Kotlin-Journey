package Classes

fun main() {
    try {
        val s=readln().toInt()
    }catch (e: NumberFormatException){
        println("String cannot converted in string because ${e.message}")
    }
    catch (e: Exception){
        println(e.message)
    }
    finally {
        println("I will be execute every time")
    }

    println("Process done")
    isEven(5)
}
fun isEven(x:Int){
    if (x%2 !=0){
        throw IllegalArgumentException("Number is not even")
    }
}