import java.util.*

/**
 * @author sauceWu .
 * @since 2018/1/30 15:05
 */

class BaseballGame {
    fun calPoints(ops: Array<String>): Int {
        val ar = Stack<Int>()
        ops.forEach { s ->
            when (s) {
                "C" -> ar.pop()
                "D" -> ar.push(ar.peek() * 2)
                "+" -> {
                    val last1 = ar.pop()
                    val last2 = ar.peek()

                    ar.push(last1)
                    ar.push(last1 + last2)
                }
                else -> ar.push(s.toInt())
            }
        }
        var count = 0
        ar.forEach { count += it }
        return count
    }
//    fun calPoints(ops: Array<String>): Int {
//        val ar = ArrayList<Int>()
//        ops.forEachIndexed { index, s ->
//            when (s) {
//                "C" -> ar.removeAt(ar.size - 1)
//                "D" -> ar.add(2 * ar[ar.size - 1])
//                "+" -> ar.add(ar[ar.size - 2] + ar[ar.size - 1])
//                else -> ar.add(s.toInt())
//            }
//        }
//        var count = 0
//        ar.forEach { count += it }
//        return count
//    }
}
