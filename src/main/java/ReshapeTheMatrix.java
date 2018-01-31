/**
 * @author sauceWu .
 * @since 2018/1/30 17:21
 */

class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int h = nums.length;
        int w = nums[0].length;
//        先判断能不能转换
        if (h * w != r * c)
            return nums;
        int[][] res = new int[r][c];
//
        for (int i = 0; i < r * c; ++i) {
            res[i / c][i % c] = nums[i / w][i % w];
        }
        return res;
    }
}
