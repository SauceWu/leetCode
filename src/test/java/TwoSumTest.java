import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/1/29 18:50
 */
public class TwoSumTest {

    @Test
    public void twoSum() {
        Assert.assertArrayEquals(new int[]{1,2},new TwoSum().twoSum(new int[]{3,2,4},6));
    }
}