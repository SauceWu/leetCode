/**
 * @author sauceWu .
 * @since 2018/1/31 18:54
 */

class NondecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        int idx = -1;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
                idx = i;
            }
        }

        if (count == 0) {
            return true;
        }
        else if (count >= 2) {
            return false;
        }
        else {
            if (idx == 1 || idx + 1 == n) {
                return true;
            }
            if (nums[idx - 1] <= nums[idx + 1]) {
                return true;
            }
            // 0 2 5 4 4    idx points at 1
            else return idx - 2 >= 0 && nums[idx - 2] <= nums[idx];
        }
    }
}
