package coroutine

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main(): Unit = runBlocking {
//        saveUserLogs()
        fetchUserPref()

}

suspend fun saveUserLogs(){
    val job =CoroutineScope(Dispatchers.IO).launch {
        println("Saving Started")
        delay(1000.milliseconds)
        println("Saving done")
    }
    job.join()
    println("All logs save in db")
}


suspend fun fetchUserPref(){
    val userPref =CoroutineScope(Dispatchers.IO).async {
        println("fetching userdata")
        delay(1000.milliseconds)
        "Anupam yadav"
    }
    val username = userPref.await()
    println("username is $username")
}