/*
    String is immutable in Java, whenever String manipulation occurs a new String is generated
    and the old one, Java discards. These String operations are expensive and generate a heavy
    workload for the garbage collector. StringBuilder (and StringBuffer) are mutable objects,
    eliminating the discarding of cold.
 */
public class StrBuilder {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Lorem ");
        stringBuilder.append("Ipsum ");
        stringBuilder.append("Dolor ");
        stringBuilder.append("Nurit");

        System.out.println(stringBuilder.toString() + "\n");

        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("One ");
        stringBuilder1.append("Two ");
        stringBuilder1.append("Three ");
        stringBuilder1.append("Four.");
        System.out.printf("%s", stringBuilder1.toString());
    }


}
