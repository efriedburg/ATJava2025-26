import java.util.Arrays;
import java.util.Random;

public class HW15PartC {
    public static int linearSearch(int[] array, int tgtVal) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == tgtVal) 
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 10000;
        int[] data = new int[n];

        Random rand = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(n);
        }

        int[] sorted = Arrays.copyOf(data, data.length);
        Arrays.sort(sorted);

        for (int t = 0; t < 10; t++) {
            int target = rand.nextInt(n) + 1;

            long start1 = System.nanoTime();
            int linIndex = linearSearch(data, target);
            long end1 = System.nanoTime();
            long linTime = end1 - start1;

            long start2 = System.nanoTime();
            int binIndex = Arrays.binarySearch(sorted, target);
            long end2 = System.nanoTime();
            long binTime = end2 - start2;

            System.out.println("Target: " + target);
            System.out.println("Linear search index: " + linIndex + ", Time: " + linTime + " ns");
            System.out.println("Binary search index: " + binIndex + ", Time: " + binTime + " ns");
            System.out.println();
        }
    }
}