import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/1/30 16:36
 */
public class DistributeCandiesTest {

    @Test
    public void distributeCandies() {
        Assert.assertEquals(3,new DistributeCandies().distributeCandies(new int[]{1,1,2,2,3,3}));
        Assert.assertEquals(2,new DistributeCandies().distributeCandies(new int[]{1,1,2,3}));
    }
}