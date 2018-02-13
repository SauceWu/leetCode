/**
 * @author sauceWu .
 * @since 2018/2/8 15:42
 */

class LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : a.length() > b.length() ? a.length() : b.length();
    }
}
 