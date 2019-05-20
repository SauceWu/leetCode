import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sauce
 * @since 2019-05-09
 */
public class PlusOneTest {

    @Test
    public void plusOne() {
        Assert.assertArrayEquals(new int[]{1, 2, 3, 5}, new PlusOne().plusOne(new int[]{1, 2, 3, 4}));
        Assert.assertArrayEquals(new int[]{1, 0}, new PlusOne().plusOne(new int[]{9}));
    }
}