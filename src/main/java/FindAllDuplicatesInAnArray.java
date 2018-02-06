import java.util.ArrayList;
import java.util.List;

/**
 * @author sauceWu .
 * @since 2018/2/1 11:51
 */

class FindAllDuplicatesInAnArray {
//    类似于桶排序 把正负当作是否出现 位数当作出现过的数字 题干中 1 ≤ a[i] ≤ n (n = size of array）是重点
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                result.add(i+1);
            }
        }
        return result;
    }
}
