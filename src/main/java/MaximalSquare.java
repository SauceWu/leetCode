public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
//         dp[i+1][j+1]=min(dp[i][j],dp[i+1][j],dp[i][j+1])+1
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int width = matrix[0].length;
        int height = matrix.length;
        int maxcount = 0;
        int[][] dp = new int[height + 1][width + 1];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (matrix[i][j] == '1') {
                    dp[i + 1][j + 1] = Math.min(Math.min(dp[i][j], dp[i + 1][j]), dp[i][j + 1]) + 1;

                    maxcount = Math.max(dp[i + 1][j + 1], maxcount);
                }
            }
        }
        return maxcount * maxcount;
    }

}
