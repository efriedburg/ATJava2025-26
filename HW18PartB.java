import java.util.ArrayList;
import java.util.Scanner;

public class HW18PartB {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<Double>();

        while (true)
        {
            System.out.print("Enter a test score (or q to finish): ");
            String input = in.nextLine();
            if (input.equals("q")) {
                break;
            }
            scores.add(Double.parseDouble(input));
        }

        double sum = 0;

        for (int i = 0; i < scores.size(); i++) {
            System.out.printf("%.2f\n", scores.get(i));
            sum = sum + scores.get(i);
        }

        double average = sum / scores.size();
        System.out.printf("Average: %.2f\n", average);
    }

}
