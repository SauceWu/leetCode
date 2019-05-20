/**
 * @author sauce
 * @since 2019-05-09
 */
public class LargestNumberAtLeastTwiceofOthers {


    public int dominantIndex(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int index = -1;
        int max = -1;
        int smex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                smex=max;
                max = nums[i];
                index = i;
            } else if (nums[i] > smex) {
                smex = nums[i];
            }

        }
        if (max < 2 * smex) {
            return -1;
        }
        return index;
    }
}
