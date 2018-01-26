import java.util.Arrays;

/**
 * @author sauceWu .
 * @since 2018/1/26 11:32
 */

class LongestCommonPrefix {

    public static void main(String[] src) {
        String result = longestCommonPrefix(new String[]{"aaaabbcc", "asdqwev", "as"});
        System.out.print(result);
    }


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


}
