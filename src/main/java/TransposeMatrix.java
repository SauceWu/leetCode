/**
 * @author sauce
 * @since 2019-06-28
 */
public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        if (A.length == 0) {
            return new int[0][0];
        }
        int[][] result = new int[A[0].length][A.length];
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                result[i][j] = A[j][i];
            }
        }
        return result;
    }
}
