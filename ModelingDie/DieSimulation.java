import java.util.Scanner;

public class DieSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Die die = new Die();
        String input;

        do {
            System.out.print("Enter 'r'to roll, 'd' to display, or 'q' to quit: ");
            input = scanner.nextLine().toLowerCase();

            if (input.equals("r")) {
                die.roll();
                System.out.println("You rolled a " + die.getValue());
            } else if (input.equals("d")) {
                die.display();
            } else if (input.equals("q")) {
                System.out.println("Quitting simulation.");
            } else {
                System.out.println("Invalid input. Please try again.");
            }
            
            System.out.println();
        } while (!input.equals("q"));
        scanner.close();
    }
}
