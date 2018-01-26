/**
 * @author sauceWu .
 * @since 2018/1/26 19:17
 */

class ReverseWordStringIII {
    public static void main(String[] src){
        String result=reverseWords("Let's take LeetCode contest");
        System.out.print(result);
    }
    public static String reverseWords(String s) {
        String[] split=s.split(" ");
        for(int i =0 ; i <split.length;i++){
            String reversed = ReverseString.reverseString(split[i]);
            split[i] = reversed;
        }
        return String.join(" ",split);

    }

}
