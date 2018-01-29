/**
 * @author sauceWu .
 * @since 2018/1/26 18:40
 */

class ReverseString {


    public  String reverseString(String s) {

        char[] ss = s.toCharArray();
        char[] sb = new char[ss.length];
        for (int i = 0; i < ss.length; i++) {
            sb[ss.length - 1 - i] = ss[i];
        }
        return new String(sb);
    }
}
