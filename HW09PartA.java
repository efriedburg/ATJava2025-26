import java.util.Scanner;

public class HW09PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("This program calculates your test average. Enter your scores one by one, and then enter a negative number to finish.");

        double total = 0.0;
        int count = 0;
        double score;

        while (true) {
            System.out.print("Enter score " + (count + 1) + ": ");
            score = in.nextDouble();
            
            if (score < 0) {
                break;
            }
            
            total += score;
            count++;
        }
        if (count > 0) {
            double average = total / count;
            System.out.printf("You entered %d scores.%n", count);
            System.out.println("Your test average is: " + average);
        } else {
            System.out.println("No valid scores entered.");
        }
    }
}

