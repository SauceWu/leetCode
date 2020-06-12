package coroutines

import kotlinx.coroutines.*
import java.lang.NullPointerException
import java.lang.Thread.sleep
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

class CoroutinesTest {


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val coroutinesTest = CoroutinesTest()
//            CoroutineExceptionHandler { coroutineContext, throwable ->
//                print(throwable.javaClass.name)
//            }
//

            GlobalScope.launch() {
                val async3 = async { coroutinesTest.test3() }
                val async4 = async { coroutinesTest.test4() }
                async3.await()
                print("完事了12")
                async4.await()
                print("全完事了")
                for (i in 1..10) {
                    coroutinesTest.test2(i)
                }
            }
            while (true) {
                sleep(1000)
                print("\n" + System.currentTimeMillis())
            }
//            coroutinesTest.test1()
        }
    }

    fun test2(i: Int): String = runBlocking {
        delay(1000)
        if (i == 2) {
            throw   NullPointerException()

        } else {
            return@runBlocking i.toString()
        }
    }

    suspend fun test1(i: Int): String {
        delay(1000)
        if (i == 2) {
            throw   RuntimeException()

        } else {
            return i.toString()
        }
    }

    suspend fun test3(): String {
        delay(2000)
        print("完事了1")
        return "test3"

    }

    suspend fun test4(): String {
        delay(1000)
        print("完事了2")
        throw RuntimeException()
        return "test4"
    }


//
//    suspend fun <T> requestAsync(
//            context: CoroutineContext = EmptyCoroutineContext,
//            method: (e: Exception) -> Unit = {
//                onError(it)
//            },
//            block: suspend CoroutineScope.() -> T): T? {
//        try {
//            return context.async { method }
//        } catch (e: Exception) {
//            method(e)
//        }
//        return null;
//    }

//    fun onError(e: Exception) {
//        print(e.message)
//    }


}