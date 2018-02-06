import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/2/5 18:48
 */
public class SingleElementInASortedArrayTest {

    @Test
    public void singleNonDuplicate() {
        Assert.assertEquals(2, new SingleElementInASortedArray().singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
        Assert.assertEquals(10, new SingleElementInASortedArray().singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}));
    }
}