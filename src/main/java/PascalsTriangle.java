import java.util.*;

import static utils.ListUtils.List2String;

/**
 * @author sauce
 * @since 2019-05-10
 */
public class PascalsTriangle {
    public static void main(String[] src) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        System.out.println(List2String(pascalsTriangle.generate(10)));
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> array = new LinkedList<>();
            List<Integer> front = null;
            if (i != 0) {
                front = result.get(i - 1);
            }
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i ) {
                    array.add(1);
                } else {
                    array.add(front.get(j - 1) + front.get(j));
                }
            }
            result.add(array);
        }
        return result;
    }
}
