import java.util.Arrays;

/**
 * @author sauceWu .
 * @since 2018/1/26 11:32
 */

class LongestCommonPrefix {


    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        StringBuilder prefix = new StringBuilder();
        Arrays.sort(strs);
        char[] a = strs[0].toCharArray();
        char[] b = strs[strs.length - 1].toCharArray();
        int i = 0;
        while (i < a.length && i < b.length && a[i] == b[i]) prefix.append(a[i++]);
        return prefix.toString();
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                String s = strs[j];
                if (s.length() < i || strs[j] .charAt(i)!= strs[j - 1].charAt(i)) {
                    return sb.toString();
                }

            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}
