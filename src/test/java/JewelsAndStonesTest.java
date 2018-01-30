import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/1/30 14:44
 */
public class JewelsAndStonesTest {

    @Test
    public void numJewelsInStones() {
        Assert.assertEquals(3, new JewelsAndStones().numJewelsInStones("aA", "aAAbbbb"));
        Assert.assertEquals(0, new JewelsAndStones().numJewelsInStones("z", "ZZ"));
    }
}