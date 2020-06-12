public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int leng = nums.length;
        if (leng == 0) {
            return 0;
        }
        int result = 0, tmp = nums[0];
        for (int i = 1; i < leng; i++) {
            int dis = nums[i] - tmp;
            if (dis < 0) {
                tmp = nums[i];
            }
            if (dis > 0 && dis > result) {
                result = dis;
            }
        }
        return result;
    }

}
