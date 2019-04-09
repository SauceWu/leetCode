import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sauce
 * @since 2019-03-19
 */
public class NRepeatedElementInSize2NArrayTest {
    @Test
    public void checkPossibility() {
        Assert.assertEquals(3, new NRepeatedElementInSize2NArray().repeatedNTimes(new int[]{1, 2, 3, 3}));
        Assert.assertEquals(2, new NRepeatedElementInSize2NArray().repeatedNTimes(new int[]{2, 1, 2, 5, 3, 2}));
        Assert.assertEquals(5, new NRepeatedElementInSize2NArray().repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4}));
//        Assert.assertEquals("4", true, new NondecreasingArray().checkPossibility(new int[]{1, 2, 3, 4}));

    }
}