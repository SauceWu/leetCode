/**
 * @author sauce
 * @since 2019-05-14
 */
public class FibonacciNumber {
    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N <= 2) {
            return 1;
        }
        int[] cache = new int[]{1, 1};
        for (int i = 2; i < N; i++) {
            int tmp = cache[1] + cache[0];
            cache[0] = cache[1];
            cache[1] = tmp;
        }
        return cache[1];
    }
}
