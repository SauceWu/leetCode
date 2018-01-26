/**
 * @author sauceWu .
 * @since 2017/12/19 14:39
 */

class Complement {
    public static void main(String[] src){
        System.out.print(complement(5));
    }
    public static int findComplement(int num) {
        int valid = 0;  // 最高位为1的位数
        int tmp = num;
        while (tmp > 0) {
            tmp /= 2;
            valid++;
        }

        return ~num & ((1 << valid) - 1);
    }
    public static int complement(int num){
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }
}
