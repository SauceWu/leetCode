/**
 * @author sauceWu .
 * @since 2018/2/13 15:40
 */

class BinaryNumberWithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        return ((n + (n >> 1) + 1) & (n + (n >> 1))) == 0;
    }

}
