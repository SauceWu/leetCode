import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauce
 * @since 2019-06-16
 */
public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void lengthOfLongestSubstring() {
        Assert.assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"));
        Assert.assertEquals(1, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb"));
    }

}