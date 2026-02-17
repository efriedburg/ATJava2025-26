import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW21PartB {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("sales_by_cat.txt"));

        while (file.hasNextLine()) {
            String line = file.nextLine();
            String[] parts = line.split(",");

            String dept = parts[0].trim();
            String manager = parts[1].trim();
            String revenueText = parts[2].trim();

            double revenue;

            if (revenueText.equalsIgnoreCase("N/A")) {
                revenue = 0.0;
            } else {
                revenue = Double.parseDouble(revenueText);
            }

            System.out.printf("%-17s | %-10s | $%10.2f%n", dept, manager, revenue);
    }
    file.close();
}
}