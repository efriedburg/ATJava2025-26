import java.util.ArrayList;
import java.util.Scanner;

public class Test0506Part2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();

        while (true) {
            System.out.print("Enter a score or q to quit: ");
            if (scan.hasNextDouble()) {
                double score = scan.nextDouble();
                scores.add(score);
            } else {
                String input = scan.next();
                if (input.equalsIgnoreCase("q")) {
                    break;
            }
            }
        }
        System.out.println("--------------------");

        double sum = 0;
        for (double score : scores) {
            System.out.printf("%8.2f\n", score);
            sum += score;
    }

    double average = sum / scores.size();

    System.out.println("--------------------");
    System.out.printf("avg = %.2f\n", average);
}
}