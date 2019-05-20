/**
 * @author sauce
 * @since 2019-05-09
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            int left = 0, right = 0;
            for (int j = 0; j < i; j++) {
                left += nums[j];
            }
            for (int j = i+1; j < nums.length; j++) {
                right += nums[j];
            }
            if (left == right) {
                return i;
            }

        }
        return -1;
    }
}
