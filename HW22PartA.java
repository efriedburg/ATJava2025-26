import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW22PartA {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean done = false;

        while (done == false) {
            System.out.print("Enter the name of the file to read: ");
            String filename = keyboard.nextLine();

            if (filename.equals("#")) {
                System.out.println("Goodbye!");
                done = true;
            } else {
                try {
                    File file = new File(filename);
                    Scanner fileScanner = new Scanner(file);

                    while (fileScanner.hasNext()) {
                        String word = fileScanner.next();
                        System.out.println(word);
                    }

                    fileScanner.close();
                    done = true;
                } catch (FileNotFoundException e) {
                    System.out.println("File not found. Please try again.");
                }
            }
    }
}
}