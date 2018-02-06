/**
 * @author sauceWu .
 * @since 2018/2/5 18:48
 */

class SingleElementInASortedArray {
    public int singleNonDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i+=2) {
            if (i == nums.length - 1) {
                return nums[i];
            }
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return 0;
    }
}
