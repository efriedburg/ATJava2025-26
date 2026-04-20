import java.util.Scanner;
import mow.Yard;

public class YardDemo {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        clearScreen();

        System.out.print("Enter the height of the yard: ");
        int height = input.nextInt();

        System.out.print("Enter the width of the yard: ");
        int width = input.nextInt();

        System.out.println();

        Yard myYard = new Yard(height, width);
        myYard.printYard();

        input.close();
    }
}