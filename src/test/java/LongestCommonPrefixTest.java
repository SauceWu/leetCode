import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix2() {
        Assert.assertEquals("fl", LongestCommonPrefix.longestCommonPrefix2(new String[]{"flower", "flow", "flight"}));
    }
}