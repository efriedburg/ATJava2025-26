import java.util.Scanner;

public class HW08PartB {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the APR (As a percentage, for example, 5.5): ");
        double apr = input.nextDouble();

        System.out.print("Enter the balance: ");
        double balance = input.nextDouble();

        double rate = apr / 100.0;

        System.out.println("Year |        Int Earned ($)       |           Balance ($)");
        System.out.println("----------------------------------------------------------------------");

        for (int year = 1; year <= 5; year++) {
            double interest = balance * rate;
            balance += interest;

            System.out.printf(" %2d  | %25.2f   | %19.2f%n", year, interest, balance);
        }
    }

}
