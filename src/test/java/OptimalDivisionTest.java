import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/2/23 17:09
 */
public class OptimalDivisionTest {

    @Test
    public void optimalDivision() {
        Assert.assertEquals("1000/(100/10/2)", new OptimalDivision().optimalDivision(new int[]{1000, 100, 10, 2}));
        Assert.assertEquals("2/(3/4)", new OptimalDivision().optimalDivision(new int[]{2, 3, 4}));

    }
}