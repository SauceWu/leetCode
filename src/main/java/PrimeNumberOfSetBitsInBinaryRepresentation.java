/**
 * @author sauceWu .
 * @since 2018/1/31 14:31
 */

class PrimeNumberOfSetBitsInBinaryRepresentation {
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for (int i = L; i <= R; i++) {
            if (isPrimeNumber(countBits(i))) {
                count++;
            }
        }
        return count;
    }

    private int countBits(int num) {
        int res = 0;
        while (num > 0) {
//            个位是否为1
            if ((num & 1) == 1) {
                res++;
            }
            num = num >> 1;
        }

        return res;
    }

    private boolean isPrimeNumber(int num) {
        if (num == 2) return true;
        if (num < 2 || num % 2 == 0) return false;//识别小于2的数和偶数
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {//识别被奇数整除
                return false;
            }
        }
        return true;
    }
}
