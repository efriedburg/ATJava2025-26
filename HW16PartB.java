import java.util.Arrays;

public class HW16PartB {
    public static void main(String[] args) {
        double a = average(10, 8, 9);
        System.out.println(a);

        double[] scores = { 100, 90, 80, 100, 80 };
        double b = average(scores);
        System.out.println(b);
    }

    public static double average(double... values) {
        double sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum / values.length;

    }
}
