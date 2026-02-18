import java.util.Scanner;

public class HW24PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Counter cakeCounter = new Counter();
        Counter pieCounter = new Counter();

        System.out.println("Enter 'c' for cake, 'p' for pie, or 'q' to quit: ");

        String choice = "";

        while (!choice.equals("q")) {
            System.out.print("Your choice: ");
            choice = in.nextLine();

            if (choice.equals("c")) {
                cakeCounter.getValue();
            } else if (choice.equals("p")) {
                pieCounter.getValue();
            } else if (choice.equals("q")) {
            } else {
                System.out.println("Please enter c, p, or q.");
            }
        }

        System.out.println("Total cakes: " + cakeCounter.count());
        System.out.println("Total pies: " + pieCounter.count());
    }
}