package flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main(): Unit = runBlocking{
    /**
     * This is Cold Flow example made by [coldFlow] function
     */
/*    val coldFlow = flow {
        repeat(10){
            delay(100.milliseconds)
            println("Sending $it ")
            emit(it)
        }
    }
    launch {
        coldFlow.collect{
            delay(200.milliseconds)
            println("collecter1:->Received $it")
        }

    }
    delay(4000.milliseconds)
    launch {
        coldFlow.collect{
            delay(200.milliseconds)
            println("collecter2:->Received $it")
        }

    }
    delay(4000.milliseconds)
    launch {
        coldFlow.collect{
            delay(200.milliseconds)
            println("collecter3:->Received $it")
        }

    }*/

    /**
     * This is hot Flow example made by [MutableSharedFlow]
     */

    val hotFlow = MutableSharedFlow<Int>()
    launch {
        hotFlow.collect {
            println("Hot flow collecter1 = $it")
        }
    }

    launch {
        delay(500.milliseconds)
        hotFlow.collect {
            println("Hot flow collecter2 = $it")
        }
    }
    launch {
        repeat(10) {
            delay(100.milliseconds)
            hotFlow.emit(it)
        }
    }


}
