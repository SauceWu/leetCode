package bean;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author sauce
 * @since 2018/5/14
 */
public class T {
    static String s = "otpauth%3A%2F%2Ftotp%2F13412345678%3Fsecret%3DX5ODXD6EAVNBTI3Y%26issuer%3DBitkop.com";

    public static void main(String[] src) throws Exception {

      System.out.print( URLDecoder.decode(s,"UTF-8"));

    }
}
