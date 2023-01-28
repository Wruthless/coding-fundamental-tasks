public class RotatedString {

    public static void main(String[] args) {
        String strA = "abcdef";
        String strB = "cdefab";
        String strC = "afbecd";

        System.out.println(testForStringRotation(strA, strB));
        System.out.println(testForStringRotation(strA, strC));

        System.out.println();

        System.out.println(stringRotationTest(strA, strB));
        System.out.println(stringRotationTest(strA, strC));
    }


    public static boolean testForStringRotation(String string1, String string2) {
        String concat = string1 + string1;
        return concat.contains(string2);
    }

    public static boolean stringRotationTest(String string1, String string2) {
        String concat = string1 + string1;
        return concat.contains(string2);
    }
}

