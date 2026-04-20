import java.util.Scanner;
import mow.Yard;
import mow.Mower;

public class YardDemo {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        clearScreen();

        System.out.print("Enter the height of the yard: ");
        int height = input.nextInt();

        System.out.print("Enter the width of the yard: ");
        int width = input.nextInt();

        Yard yard = new Yard(height, width);
        Mower mower = new Mower(1, 1, 1);

        mower.randomizeMower(yard);

        clearScreen();
        yard.printYard(mower);
        delay(500);

        while (mower.updateMower(yard)) {
            clearScreen();
            yard.printYard(mower);
            delay(500);
        }

        mower.cutGrass(yard);
        clearScreen();
        yard.printYard(mower);

        input.close();
    }
}