/**
 * @author sauce
 * @since 2019-05-20
 */
public class String2Integer {
    public int myAtoi(String str) {
        str = str.trim();
        if (str == null || str.length() == 0) {
            return 0;
        }
        int sign = 1, ans = 0;
        int i = 0, n = str.length();
        while (i < n && str.charAt(i) == ' ') i++;
        if (i >= n) return 0;

        if (str.charAt(i) == '-' || str.charAt(i) == '+') {
            if (str.charAt(i) == '-') sign = -1;
            i++;
        }

        while (i < n && Character.isDigit(str.charAt(i))) {
            int num = str.charAt(i) - '0';
            if (ans > Integer.MIN_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && num > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = ans * 10 + num;
            i++;
        }
        return sign * ans;

    }


}
