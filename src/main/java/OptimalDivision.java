/**
 * @author sauceWu .
 * @since 2018/2/23 17:08
 */

class OptimalDivision {
    public String optimalDivision(int[] nums) {
        if (nums.length == 1) {
            return nums[0] + "";
        }
        if (nums.length == 2) {
            return nums[0] + "/" + nums[1];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]).append("/(").append(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            sb.append("/").append(nums[i]);

        }
        return sb.append(")").toString();
    }
}
