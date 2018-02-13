import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/2/13 15:42
 */
public class BinaryNumberWithAlternatingBitsTest {

    @Test
    public void hasAlternatingBits() {
        Assert.assertEquals(true,new BinaryNumberWithAlternatingBits().hasAlternatingBits(5));
        Assert.assertEquals(false,new BinaryNumberWithAlternatingBits().hasAlternatingBits(7));
        Assert.assertEquals(false,new BinaryNumberWithAlternatingBits().hasAlternatingBits(11));
        Assert.assertEquals(true,new BinaryNumberWithAlternatingBits().hasAlternatingBits(10));

    }
}