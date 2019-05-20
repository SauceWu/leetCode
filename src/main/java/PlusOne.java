/**
 * @author sauce
 * @since 2019-05-09
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= -1; i--) {
            if (i == -1) {
                int[] ts = new int[digits.length + 1];
                ts[0] = 1;
                System.arraycopy(digits, 0, ts, 1, digits.length);
                digits = ts;
                break;
            }
            int temp = digits[i] + 1;
            if (temp == 10) {
                digits[i] = 0;
            } else {
                digits[i] = temp;
                break;
            }

        }

        return digits;
    }
}
