/**
 * @author sauceWu .
 * @since 2018/1/26 19:17
 */

class ReverseWordStringIII {

    public String reverseWords(String s) {
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            String reversed = new ReverseString().reverseString(split[i]);
            split[i] = reversed;
        }
        return String.join(" ", split);

    }

}
