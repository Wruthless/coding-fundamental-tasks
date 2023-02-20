import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {
            19033, 6664, 681, 1009, 20616, 3255, 4055, 8234, 848, 25869, 15366, 30563, 849, 16862, 1906, 31403, 29382, 5246,
            16844, 13897, 1630, 8110, 2016, 6760, 11953, 14493, 846, 847, 26424, 5761, 11558, 30330, 30725, 8596, 1192, 25150,
            13689, 22592, 29349, 23120, 28565, 32696, 22301, 13429, 23406, 27417, 26792, 32355, 12455, 20788, 25686, 26231,
            8882, 13081, 24391, 795, 12742, 8040, 5641, 9461, 3999, 24151, 21940, 8144, 5112, 21122, 23239, 13899, 31945, 6774,
            16833, 5187, 30272, 16124, 25983, 1026, 9857, 31269, 18265, 18980, 14622, 25370, 23802, 21581, 9813, 2720, 24579,
            9869, 12812, 21614, 31583, 13198, 24205, 6446, 29284, 2947};


        System.out.println(binSearch(arr, 848));
        System.out.println(binarySearch(arr, 848));

    }

    public static int binSearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length;
        Arrays.sort(arr);

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] < x) {
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearch(int[]arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        Arrays.sort(arr);

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] < x) {
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}