import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnesComplement {

    public static void main(String[] args) {

        int n = 22;
        List<Object> oC = onesComplement(n);
        System.out.println(oC);

        List<Object> ones = onesC(n);
        System.out.println(ones);
    }


    public static List<Object> onesComplement(int n) {

        // Find number of bits
        int numOfBits = (int)(Math.floor(Math.log(n) / Math.log(2))) + 1;

        // Get ones complement using XOR to power of n
        int ones = ((1 << numOfBits) - 1) ^ n;

        // Get binary of ones complement
        String onesToBin = Integer.toBinaryString(ones);

        return Arrays.asList(ones, onesToBin);
    }

    public static List<Object> onesC(int n) {
        int getNumBits = (int)Math.floor((Math.log(n) / Math.log(2))) + 1;
        int ones = ((1 << getNumBits) - 1) ^ n;
        String binRep = Integer.toBinaryString(ones);

        return Arrays.asList(ones,binRep);

    }
}
