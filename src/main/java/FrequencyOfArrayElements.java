public class FrequencyOfArrayElements {

    public static void main(String[] args) {

        // student response array (more typically, input at run time)
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2};
        int[] frequency = new int[6]; // frequency counters

        /**
         * 1    3
         * 2    4
         * 3    8
         * 4    2
         * 5    2
         */
        arrayElementFrequency(responses, frequency);

        //arrayMemberFrequency(responses, frequency);
        //System.out.println();

    }

    public static void arrayMemberFrequency(int[] responses, int[] frequency) {

        for (int i = 0; i < responses.length; i++) {
            ++frequency[responses[i]];
        }

        for (int i = 1; i < frequency.length ; i++) {
            System.out.printf("%6d%10d%n", i, frequency[i]);
        }
    }

    public static void arrayElementFrequency(int[]responses, int[]frequency) {
        for (int i = 0; i < responses.length; i++) {
            ++frequency[responses[i]];
        }

        for (int i = 1; i < frequency.length; i++) {
            System.out.printf("%6d%10d%n", i, frequency[i]);
        }
    }
}
