/**
 * @author sauce
 * @since 2019-06-16
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int l = -1, max = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = i - 1;
//            从地位到高位夹逼
            while (l < j && s.charAt(j) != s.charAt(i)) j--;
            l = j;
            max = Math.max(max, i - l);
        }
        return max;
    }
}
