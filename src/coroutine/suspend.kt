package coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main(): Unit = runBlocking {
        launch {
        add()
        }
        launch {
            mul()
        }
}

suspend fun add(){
    println("Corotine 1 :Start ->${Thread.currentThread().name} ")
    delay(1000.milliseconds)
    println("Corotine 1 :Resumed ->${Thread.currentThread().name} ")
}

suspend fun mul(){
    println("Corotine 2 :Start ->${Thread.currentThread().name} ")
    delay(1000.milliseconds)
    println("Corotine 2 :Resumed ->${Thread.currentThread().name} ")
}