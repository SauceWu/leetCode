/**
 * @author sauceWu .
 * @since 2018/1/29 17:02
 */

internal object KeyboardRow {
    @JvmStatic
    fun main(src: Array<String>) {
        val result = findWords(arrayOf("Hello", "Alaska", "Dad", "Peace"))
        for (s in result) {
            print(s + "-")
        }
    }

    fun findWords(words: Array<String>): Array<String> {
        val ar = ArrayList<String>()
        words.filter {
            val src =it.toLowerCase()
            val row = isCon(src[0])
            return@filter src.toCharArray().none { row != isCon(it) } }.forEach { ar.add(it) }
        return ar.toTypedArray()
    }


    fun isCon(src: Char): Int {
        val row1 = charArrayOf('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p')
        val row2 = charArrayOf('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l')
        val row3 = charArrayOf('z', 'x', 'c', 'v', 'b', 'n', 'm')
        return when {
            row3.contains(src) -> 3
            row2.contains(src) -> 2
            else -> 1
        }
    }
}
