/**
 * @author sauce
 * @since 2019-05-20
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) e = mid - 1;
            else s = mid + 1;
        }
        return -1;
    }
}
