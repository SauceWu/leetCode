/**
 * @author sauceWu .
 * @since 2018/1/8 15:56
 */

class ReverseInteger {

    public  int reverse(int x) {
        String s=String.valueOf(x);
        if(x<0){
            s=s.substring(1,s.length());
        }
        char[] cs =s.toCharArray();
        StringBuilder sb=new StringBuilder();
        if(x<0)
            sb.append("-");
        for (int i = cs.length - 1; i >= 0; i--) {
            sb.append(cs[i]);
        }
        int result =0;
        try {
            result= Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return  result;
    }

}
