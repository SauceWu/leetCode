import org.junit.Assert
import org.junit.Test

/**
 * @author sauceWu .
 * @since 2018/1/29 18:50
 */
class KeyboardRowTest {

    @Test
    fun findWords() {
        Assert.assertArrayEquals(arrayOf("Alaska", "Dad"), KeyboardRow().findWords(arrayOf("Hello", "Alaska", "Dad", "Peace")))
    }
}