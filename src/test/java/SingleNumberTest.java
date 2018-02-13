import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/2/13 16:48
 */
public class SingleNumberTest {

    @Test
    public void singleNumber() {
        Assert.assertEquals(1,new SingleNumber().singleNumber(new int[]{1}));
        Assert.assertEquals(-1,new SingleNumber().singleNumber(new int[]{-1}));

    }
}