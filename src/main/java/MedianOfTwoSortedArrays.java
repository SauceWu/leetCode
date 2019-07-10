import sort.Sort;

/**
 * @author sauce
 * @since 2019-06-16
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] low = nums1;
        int[] high = nums2;
        double result;
        boolean isEven = (nums1.length + nums2.length) % 2 == 0;
        int midIndex = nums1.length + nums2.length / 2;
        if (nums1[0] > nums2[nums2.length - 1]) {
            low = nums2;
            high = nums1;
        }
        int[] all = new int[nums1.length + nums2.length];
        System.arraycopy(low, 0, all, 0, low.length);
        System.arraycopy(high, 0, all, low.length, high.length);
        if (low[low.length - 1] > high[0]) {
            Sort.quickSort(all, 0, all.length - 1);
        }
        if (isEven) {
            result = (all[midIndex] + all[midIndex + 1]) / 2f;
        } else {
            result = (double) all[midIndex];
        }
        return result;
    }

}
