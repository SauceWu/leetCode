/**
 * @author sauceWu .
 * @since 2018/1/26 14:11
 */

class PalindromeNumber {


    public  boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int digits = 1;
        int original = x;
        while (x > 9) {
            digits *= 10;
            x /= 10;
        }
        x = original;
        while (x > 0) {
            int msd = x / digits;
            int lsd = x % 10;
            if (msd != lsd) {
                return false;
            }
            x -= msd * digits;
            x /= 10;
            digits /= 100;
        }
        return true;
    }
}
