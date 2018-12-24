package fetureDemo.corountinesDemo

import kotlinx.coroutines.*
import java.util.concurrent.Executors

fun main(args: Array<String>) {
    exampleAsyncAwait2()
}

suspend fun printlnDelayed(message: String) {
    delay(1000)
    println(message)
}

suspend fun calculatedHardThings(startNum: Int): Int {
    delay(timeMillis = 1000)
    return startNum * 10
}

fun exampleBlocking() = runBlocking {
    println("one")
    printlnDelayed("two")
    println("three")
}

fun exampleBlockingDispatcher() {
    runBlocking(Dispatchers.Default) {
        println("One - from thread ${Thread.currentThread().name}")
        printlnDelayed("Two - from thread ${Thread.currentThread().name}")
    }

    println("Three - from thread ${Thread.currentThread().name}")
}

fun exampleLaunchGlobal() = runBlocking {
    println("one - from thread ${Thread.currentThread().name}")
    GlobalScope.launch {
        printlnDelayed("Two - from thread ${Thread.currentThread().name}")
    }

//    delay(2000)
    println("Three - from thread ${Thread.currentThread().name}")
    delay(2000)
}

fun exampleLaunchGlobalWaiting() = runBlocking {
    println("one - from thread ${Thread.currentThread().name}")
    val job = launch {
        printlnDelayed("Two - from thread ${Thread.currentThread().name}")
    }


    println("Three - from thread ${Thread.currentThread().name}")
    job.join()

}

fun exampleLaunchCoroutineScope() = runBlocking {
    println("one - from thread ${Thread.currentThread().name}")

    val customDispatcher = Executors.newFixedThreadPool(1).asCoroutineDispatcher()

    launch(customDispatcher) {
        printlnDelayed("Two - from thread ${Thread.currentThread().name}")
    }


    println("Three - from thread ${Thread.currentThread().name}")

  //  (customDispatcher.executor as ExecutorService).shutdown()
}

fun exampleAsyncAwait() = runBlocking {
    val startTime = System.currentTimeMillis()

    val deferred1 = async { calculatedHardThings(10) }.await()
    val deferred2 = async { calculatedHardThings(20) }.await()
    val deferred3 = async { calculatedHardThings(30) }.await()

    val sum = deferred1 + deferred3 + deferred2
    println(sum)
    val endTime = System.currentTimeMillis()
    println("Time taken: ${endTime - startTime}")
}

fun exampleAsyncAwait2() = runBlocking {
    val startTime = System.currentTimeMillis()

    val deferred1 = async { calculatedHardThings(10) }
    val deferred2 = async { calculatedHardThings(20) }
    val deferred3 = async { calculatedHardThings(30) }

    val sum = deferred1.await() + deferred3.await() + deferred2.await()
    println(sum)
    val endTime = System.currentTimeMillis()
    println("Time taken: ${endTime - startTime}")
}

fun exampleWithContext() = runBlocking {
    val startTime = System.currentTimeMillis()

    val result1= withContext(Dispatchers.Default) { calculatedHardThings(10) }
    val result2= withContext(Dispatchers.Default) { calculatedHardThings(20) }
    val result3= withContext(Dispatchers.Default) { calculatedHardThings(30) }

    val sum = result1 + result2 + result3
    println(sum)
    val endTime = System.currentTimeMillis()
    println("Time taken: ${endTime - startTime}")
}

