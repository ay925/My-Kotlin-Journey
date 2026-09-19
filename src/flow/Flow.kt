package flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main(): Unit = runBlocking{
    val flow = flow {
        repeat(10){
            delay(1000.milliseconds)
            println("Sending $it ")
            emit(it)
        }
    }
    launch {
        flow.collect{
            println("Received $it")
        }

    }

}
