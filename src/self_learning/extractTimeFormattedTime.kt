package self_learning

fun main(){
   val hour=extractTimeFormattedTime("09:33 AM")[0]
   val minute=extractTimeFormattedTime("09:33 AM")[1]
    println(hour)
    println(minute)
}
fun extractTimeFormattedTime(time: String): List<Int>{
    val timeHour= time.split(":")[0].toInt()
    val timeMinutes=time.split(":")[1].removeRange(2,5).toInt()
    return listOf(timeHour,timeMinutes)
}