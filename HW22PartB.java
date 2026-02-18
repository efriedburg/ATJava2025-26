import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW22PartB {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the name of the file to read: ");
        String filename = keyboard.nextLine();

        try {
            Scanner fileScanner = new Scanner(new File(filename));

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.isEmpty()) continue;

                String[] parts = line.split(",");

                String name = parts[0].trim();
                String yearText = parts[1].trim();

                try {
                    int year = Integer.parseInt(yearText);
                    System.out.println(name + " was born in " + year);
                } catch (NumberFormatException e) {
                    System.out.println("The year that " + name + " was born is unknown.");
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        keyboard.close();
    }
}