import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class HW19PartA {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> temps = new ArrayList<Integer>();
        Scanner input = new Scanner(new File("temps.txt"));

        int lowest = Integer.MAX_VALUE;

        while (input.hasNextInt()) {
            int temp = input.nextInt();
            temps.add(temp);
            if (temp < lowest) {
                lowest = temp;
            }
        }

        for (int t : temps) {
            if (t == lowest) {
                System.out.println(t + " <= lowest");
            } else {
                System.out.println(t);
            }
        }
        input.close();
    }
}