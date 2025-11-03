import java.util.Scanner;

public class Unit02TestPartA {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Hello, " + name + "!");

        System.out.print("Enter a dollar amount: ");
        double firstAmount = in.nextDouble();

        System.out.print("Enter another dollar amount: ");
        double secondAmount = in.nextDouble();

        if (firstAmount > 9999.99 || secondAmount > 9999.99) {
            System.out.println("Amount exceeds maximum limit of $9999.99");
        } else {

        double average = (firstAmount + secondAmount) / 2;

        System.out.printf(" amount #1: $%6.2f%n amount #2: $%6.2f%n average: $%8.2f%n", firstAmount, secondAmount, average);

        }

        in.close();
    }

    
}
