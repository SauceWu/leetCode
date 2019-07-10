/**
 * @author sauce
 * @since 2019-07-08
 * <p>
 * <p>
 * lexicographically 字典序
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        //find first
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
//            找到比当前大的
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int f, int s) {
        int tmp = nums[f];
        nums[f] = nums[s];
        nums[s] = tmp;
    }
}
