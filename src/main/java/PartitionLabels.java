import java.util.ArrayList;
import java.util.List;

/**
 * @author sauceWu .
 * @since 2018/1/30 18:17
 */

class PartitionLabels {
    public Integer[] partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        char[] cs  = S.toCharArray();
        int n = cs.length;
        int[] last = new int[32];
        for (int i = 0; i < n; ++i) {
            last[cs[i] - 'a'] = i;
        }
        int pre = -1;
        int max = 0;
        for (int i = 0; i < n; ++i) {
            if (last[cs[i] - 'a'] > max) max = last[cs[i] - 'a'];
            if (max == i) {
                res.add(max - pre);
                pre = max;
                max = max + 1;
            }
        }
        return res.toArray(new Integer[]{});

    }

}
