/**
 * @author sauceWu .
 * @since 2018/1/26 12:00
 */

class EncodeAndDecodeTinyURL {
    public static void main(String[] src) {
        EncodeAndDecodeTinyURL encodeAndDecodeTinyURL = new EncodeAndDecodeTinyURL();
        String result = encodeAndDecodeTinyURL.decode(encodeAndDecodeTinyURL.encode("http://www.saucewu.site"));
        System.out.print(result);
    }

    public String encode(String longUrl) {
        return longUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortUrl;

    }


// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
}
