

import org.junit.Assert;
import org.junit.Test;


/**
 * @author sauceWu .
 * @since 2018/1/31 14:35
 */
public class PrimeNumberOfSetBitsInBinaryRepresentationTest {
    @Test
    public void countPrimeSetBits() {
        Assert.assertEquals(4, new PrimeNumberOfSetBitsInBinaryRepresentation().countPrimeSetBits(6, 10));
        Assert.assertEquals(5, new PrimeNumberOfSetBitsInBinaryRepresentation().countPrimeSetBits(10, 15));

    }
}