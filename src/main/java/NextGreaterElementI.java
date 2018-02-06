/**
 * @author sauceWu .
 * @since 2018/1/31 17:01
 */

class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = position(nums2, nums1[i]);
        }
        return nums1;
    }

    private int position(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] > num)
                        return nums[j];
                }
            }
        }
        return -1;
    }
}
