/**
 * @author sauceWu .
 * @since 2018/1/26 14:24
 */

class ComplexNumberMultiplication {

//   实际上短String 用+ 连接更快 但为了良好习惯 还是使用StringBuilder

    public  String complexNumberMultiply(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int indexA=a.indexOf("+");
        int indexB=b.indexOf("+");
        int aaa = Integer.parseInt(a.substring(0,indexA));
        int bbb = Integer.parseInt(b.substring(0,indexB));
        int aaaa=Integer.parseInt((a.substring(indexA+1,a.length()-1)));
        int bbbb=Integer.parseInt((b.substring(indexB+1,b.length()-1)));
        stringBuilder.append(aaa * bbb-aaaa*bbbb);
        stringBuilder.append("+");
        stringBuilder.append(aaa * bbbb+bbb*aaaa);
        stringBuilder.append("i");
        return stringBuilder.toString();
    }
}
