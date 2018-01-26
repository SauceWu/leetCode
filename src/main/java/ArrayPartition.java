import java.util.Arrays;

/**
 * @author sauceWu .
 * @since 2017/12/19 12:34
 */

class ArrayPartition {
    public static void main(String[] src) {
        System.out.print(arrayPairSum(new int[]{1,2,3,4}));

    }

    public static int arrayPairSum(int[] nums) {
        int result = 0;
        int index = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2-1; i++) {
           
            result += nums[index];
        }
        return result;
    }
}
