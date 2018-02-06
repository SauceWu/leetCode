/**
 * @author sauceWu .
 * @since 2018/1/30 17:53
 */

class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int h = matrix.length;
        int w = matrix[0].length;

        for (int i = 0; i < h - 1; i++) {
            for (int j = 0; j < w - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1])
                    return false;
            }
        }

        return true;
    }

}
