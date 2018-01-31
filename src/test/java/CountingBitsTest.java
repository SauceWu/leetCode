import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/1/30 17:08
 */
public class CountingBitsTest {

    @Test
    public void countBits() {
        Assert.assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, new CountingBits().countBits(5));
    }
}