import java.util.Scanner;

public class Unit02ProjectPartB {
  
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        System.out.print("Enter the amount due in dollars: ");
        double amountDue = in.nextDouble();

        System.out.print("Enter the amount paid in dollars: ");
        double amountPaid = in.nextDouble();

        int change = (int)Math.round((amountPaid - amountDue) * 100);

        int dollars = change / 100;
        change %= 100;

        int quarters = change / 25;
        change %= 25;

        int dimes = change / 10;
        change %= 10;

        int nickels = change / 5;
        change %= 5;

        int pennies = change;

        System.out.printf("%-14s %d%n", "Dollars:", dollars);
        System.out.printf("%-14s %d%n", "Quarters:", quarters);
        System.out.printf("%-14s %d%n", "Dimes:", dimes);
        System.out.printf("%-14s %d%n", "Nickels:", nickels);
        System.out.printf("%-14s %d%n", "Pennies:", pennies);
    }

}
