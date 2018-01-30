import org.junit.Assert
import org.junit.Test

/**
 * @author sauceWu .
 * @since 2018/1/30 15:31
 */
class BaseballGameTest {

    @Test
    fun calPoints() {
        Assert.assertEquals(30, BaseballGame().calPoints(arrayOf("5", "2", "C", "D", "+")))
        Assert.assertEquals(27, BaseballGame().calPoints(arrayOf("5","-2","4","C","D","9","+","+")))
    }
}