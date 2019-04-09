/**
 * @author sauce
 * @since 2019-03-19
 */
public class NRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] A) {
        for (int k = 1; k <= 3; ++k)
            for (int i = 0; i < A.length - k; ++i)
                if (A[i] == A[i + k])
                    return A[i];

        return -1;
    }
}
