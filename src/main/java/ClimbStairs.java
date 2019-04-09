/**
 * @author sauce
 * @since 2019-04-09
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        int[] tmp = new int[n + 1];
        if (n == 0) {
            return 1;
        }
        tmp[0] = 1;
        tmp[1] = 1;
        for (int i = 2; i <= n; i++) {
            tmp[i] = tmp[i - 1] + tmp[i - 2];
        }
        return tmp[n];
    }
}
