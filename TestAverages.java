import java.util.Scanner;

public class TestAverages {
    
    public static void main(String[] args) {
        
        double[] scores = new double[10];
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter up to 10 scores (or enter q to end):");

        while (count < 10) {
            System.out.print("Score " + (count + 1) + ": ");
            String entry = input.nextLine();

            if (entry.equalsIgnoreCase("q")) {
                break;
            }

            try {
                double score = Double.parseDouble(entry);
                scores[count] = score;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number or q.");
            }
        }
    
        if (count == 0) {
            System.out.println("No scores were entered.");
        } else {
            double sum = 0;
            double max = scores[0];
            for (int i = 0; i < count; i++) {
                sum += scores[i];
                if (scores[i] > max) {
                    max = scores[i];
                }
            }
            double average = sum / count;
            System.out.println("Number of scores entered: " + count);
            System.out.println("Average score: " + average);
            System.out.println("Highest score: " + max);
       
        }
    }

}