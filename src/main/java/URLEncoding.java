import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.io.UnsupportedEncodingException;

class URLEncoding {


    public static void main(String[] args) {
        String string = "https://www.example.com/lorem?name= W Brandon Gonzales Test";
        System.out.println(encodeURLSpaces(string));


        String string2 = "http://www.test.com/lorem?name= W B Gonzales Test Test ";
        System.out.println(encUrl(string2));
    }

    public static String encodeURLSpaces(String input) {
        return input.stripTrailing().replace(" ", "%20");
    }

    public static String encUrl(String input) {
        return input.stripTrailing().replace(" ", "%20");
    }
}