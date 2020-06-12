import java.util.Random;

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


    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < 100000000; i++) {
            int r = new Random().nextInt(4);
            array[r]++;
        }
        System.out.println(String .format("第一周%d\n第二周%d\n第三周%d\n第四周%d\n",array[0],array[1],array[2],array[3]));

    }
}
