import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/2/23 17:45
 */
public class PalindromicSubstringsTest {

    @Test
    public void countSubstrings() {
        Assert.assertEquals(3, new PalindromicSubstrings().countSubstrings("abc"));
        Assert.assertEquals(6, new PalindromicSubstrings().countSubstrings("aaa"));
    }
}