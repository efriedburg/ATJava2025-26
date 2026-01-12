import java.util.Scanner;

public class ManipulatingPartiallyFilledArraysPartB {

    public static int insert(double[] array, int currentSize, int targetIndex, double newElement) {
        if (currentSize >= array.length) {
            return currentSize;
        }
        if (targetIndex < 0 || targetIndex > currentSize) {
            return currentSize;
        }
        for (int i = currentSize; i > targetIndex; i--) {
            array[i] = array[i - 1];
        }
        array[targetIndex] = newElement;
        return currentSize + 1;
    }
    
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
            return;
        }

        System.out.print("Enter an index to insert a new score: ");
        int insertIndex = Integer.parseInt(input.nextLine());

        System.out.print("Enter the new score to insert: ");
        double newScore = Double.parseDouble(input.nextLine());

        count = insert(scores, count, insertIndex, newScore);



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
