import java.security.SecureRandom;

public class RollDie {

    public static void main(String[] args) {
        roll(6000000);
        System.out.println();
        rollDie(60000);
    }

    public static void roll(int numOfRolls) {

        SecureRandom secureRandom = new SecureRandom();
        int[] frequency = new int[7];

        for (int i = 0; i < numOfRolls; i++) {
            ++frequency[1 + secureRandom.nextInt(6)];
        }

        System.out.printf("%s%10s%n", "Face", "Frequency");
        for (int i = 1; i < frequency.length; i++) {
            System.out.printf("%4d%10d%n", i, frequency[i]);
        }
    }

    public static void rollDie(int numOfRolls) {

        SecureRandom secureRandom = new SecureRandom();
        int[] frequency = new int[7];

        for (int i = 0; i < numOfRolls; i++) {
            ++frequency[1 + secureRandom.nextInt(6)] ;
        }

        System.out.printf("%4s%10s%n", "Face", "Frequency");

        for (int i = 1; i < frequency.length; i++) {
            System.out.printf("%4d%10d%n", i, frequency[i]);
        }
    }
}
