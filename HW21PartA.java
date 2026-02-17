import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW21PartA {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner file = new Scanner(new File("Top5Unemployment.txt"));

        System.out.println("---------------------------------------------------------------");
        System.out.println("                   Top 5 Unemployment Rates");
        System.out.println("---------------------------------------------------------------");

        while (file.hasNextLine()) {
            String line = file.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split(",");

            String country = parts[0].trim();
            double rate = Double.parseDouble(parts[1].trim());
            int rank = Integer.parseInt(parts[2].trim());
            String region = parts[3].trim();

            System.out.printf("Ranked # %2d: %-16s | %6.2f%% | %-23s%n", rank, country, rate, region);
        }

        System.out.println("---------------------------------------------------------------");
        
        file.close();
    }
}
