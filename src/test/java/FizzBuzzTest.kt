import org.junit.Assert
import org.junit.Test

/**
 * @author sauceWu .
 * @since 2018/1/30 15:56
 */
class FizzBuzzTest {

    @Test
    fun fizzBuzz() {
        Assert.assertArrayEquals(arrayOf( "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"),FizzBuzz().fizzBuzz(15))
    }
}