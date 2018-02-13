import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/2/8 15:44
 */
public class LongestUncommonSubsequenceITest {

    @Test
    public void findLUSlength() {
        Assert.assertEquals(3, new LongestUncommonSubsequenceI().findLUSlength("aba", "cdc"));
    }
}