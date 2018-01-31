import java.util.ArrayList;
import java.util.List;

/**
 * @author sauceWu .
 * @since 2018/1/30 15:49
 */
public class FizzBuzz {
    public String[] fizzBuzz(int n) {
        List<String> ar = new ArrayList<>();
        if (n == 0) return ar.toArray(new String[n]);

        int count = 1;
        while (count <= n) {
            if (count % 3 == 0 && count % 5 == 0) ar.add("FizzBuzz");
            else if (count % 3 == 0) ar.add("Fizz");
            else if (count % 5 == 0) ar.add("Buzz");
            else ar.add(String.valueOf(count));
            count++;
        }
        return ar.toArray(new String[n]);
    }


//    public String[] fizzBuzz(int n) {
//        return fizzz(n, new ArrayList<>()).toArray(new String[n]);
//    }
//
//    private List<String> fizzz(int n, List<String> ar) {
//        if (n <= 0) {
//            return ar;
//        }
//        String src = "";
//        if (n % 3 == 0) {
//            src += "Fizz";
//        }
//        if (n % 5 == 0) {
//            src += "Buzz";
//        }
//        if (src.isEmpty()) {
//            src = String.valueOf(n);
//        }
//        ar.add(0, src);
//        return fizzz(n - 1, ar);
//    }
}