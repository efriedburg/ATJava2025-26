import java.util.Scanner;

public class HW25PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CashRegister cr = new CashRegister();

        System.out.println("Enter a price to add, or 't' to get total/count, 'd' to delete last, 'c' to clear, or 'q' to quit.");

        while (true) {
            System.out.print("> ");
            String input = in.nextLine().trim();

            if (input.equalsIgnoreCase("q")) {
                break;
            } else if (input.equalsIgnoreCase("t")) {
                System.out.printf("Items: %d, Total: $%.2f%n", cr.getCount(), cr.getTotal());
            } else if (input.equalsIgnoreCase("d")) {
                cr.removeItem();
                System.out.println("Last item removed.");
            } else if (input.equalsIgnoreCase("c")) {
                cr.clear();
                System.out.println("Cash register cleared.");
            } else {
                try {
                    double price = Double.parseDouble(input);
                    cr.addItem(price);
                    System.out.printf("Added item: $%.2f%n", price);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a price, 't', 'd', 'c', or 'q'.");
                }
            }
        }
        System.out.println("Goodbye!");
        in.close();
    }
}