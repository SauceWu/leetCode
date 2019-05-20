import java.util.Arrays;
import java.util.List;

/**
 * @author sauce
 * @since 2019-05-13
 */
public class PascalsTriangleII {
    public static void main(String[] args) {
//        System.out.println(ListUtils.array2String(new PascalsTriangleII().getRow(5)));
    }

    public List<Integer> getRow(int rowIndex) {
        Integer[] result = new Integer[rowIndex + 1];
        for (int i = 0; i <= rowIndex; i++)
            result[i] = 1;
        for (int i = 2; i <= rowIndex; i++) {
            for (int j = i - 1; j > 0; j--) {
                result[j] = result[j] + result[j - 1];
            }
        }
        return Arrays.asList(result);
    }


}
