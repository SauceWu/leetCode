import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauce
 * @since 2019-04-09
 */
public class ClimbStairsTest {

    @Test
    public void climbStairs() {
        ClimbStairs climbStairs = new ClimbStairs();
        Assert.assertEquals(1, climbStairs.climbStairs(0));
        Assert.assertEquals(1, climbStairs.climbStairs(1));
        Assert.assertEquals(2, climbStairs.climbStairs(2));
        Assert.assertEquals(3, climbStairs.climbStairs(3));
    }
}