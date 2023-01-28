import java.sql.SQLOutput;

import static java.util.Collections.replaceAll;

public class RepeatingChars {
    public static void main(String[] args) {

        String testString = "aaaabbbdddeeffffggggghhhhhiiiij";
        findRepeats(testString);

        System.out.println("\n");

        testForRepeatingChars(testString);

    }

    public static void findRepeats(String string) {
        int match = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    match++;
                }
            }
            System.out.println(string.charAt(i) + " -- " + match);
            String dupe = String.valueOf(string.charAt(i)).trim();
            string = string.replaceAll(dupe, "");
            match = 0;
        }
    }

    public static void testForRepeatingChars(String string) {
        int match = 0;

        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if(string.charAt(i) == string.charAt(j)) {
                    match++;
                }
            }
            System.out.printf("%s%s%d%n", string.charAt(i), " --- ", match);
            String dupes = String.valueOf(string.charAt(i)).trim();
            string = string.replace(dupes,"");
            match = 0;
        }
    }
}



