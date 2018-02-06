import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/1/31 18:55
 */
public class NondecreasingArrayTest {

    @Test
    public void checkPossibility() {
        Assert.assertEquals("1", true, new NondecreasingArray().checkPossibility(new int[]{4, 2, 3}));
        Assert.assertEquals("2", false, new NondecreasingArray().checkPossibility(new int[]{4, 2, 1}));
        Assert.assertEquals("3", true, new NondecreasingArray().checkPossibility(new int[]{-1, 4, 2, 3}));
//        Assert.assertEquals("4", true, new NondecreasingArray().checkPossibility(new int[]{1, 2, 3, 4}));

    }
}