import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author sauceWu .
 * @since 2018/1/26 12:10
 */

class SelfDividingNumbers {


    public  List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int tmp = i;
            while (tmp != 0 && tmp % 10 != 0) {
                if (i % (tmp % 10) != 0) {
                    break;
                }
                tmp = tmp / 10;
            }
            if (tmp == 0) {
                result.add(i);
            }
        }
        return result;
    }


    public List<Integer> selfDividingNumberss(int left, int right) {
        List<Integer> res = new LinkedList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                res.add(i);
            }
        }
        return res;
    }

    private static boolean isSelfDividing(int a) {
        int b = a;
        while (b != 0) {
            int d = b % 10;
            if (d == 0) {
                return false;
            }
            if (a % d != 0) {
                return false;
            }
            b /= 10;
        }
        return true;
    }
}
