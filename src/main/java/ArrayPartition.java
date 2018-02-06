import java.util.Arrays;

/**
 * @author sauceWu .
 * @since 2017/12/19 12:34
 */

class ArrayPartition {

    public  int arrayPairSum(int[] nums) {
        int result = 0;
        int index = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2-1; i++) {
           
            result += nums[index];
        }
        return result;
    }
}
