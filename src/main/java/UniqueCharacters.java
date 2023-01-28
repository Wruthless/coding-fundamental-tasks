import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.IntBuffer;

public class UniqueCharacters {

    public static void main(String[] args) {

        UniqueCharacters obj = new UniqueCharacters();
        String str_a = "brandon";
        String str_b = "gonzales";


        if (obj.uniqueCharacters(str_b)) {
            System.out.println("[!] The string has all unique characters...");
        } else {
            System.out.println("[x] Duplicates characters detected ...");
        }

        if (testForUniqueCharacters(str_a)) {
            System.out.println("No Dupes");
        } else {
            System.out.println("Dupes");
        }
    }

    public boolean uniqueCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean testForUniqueCharacters(String string) {
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length(); j++) {
                if(string.charAt(i) == string.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
