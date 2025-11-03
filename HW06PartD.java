import java.util.Scanner;

public class HW06PartD {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the nuber of cookies you would like to buy: ");
        int cookies = input.nextInt();

        final double PRICE_PER_COOKIE = 0.99;
        double totalCost = cookies * PRICE_PER_COOKIE;
        double discountRate = 0.0;

        if (cookies > 24) {
            discountRate = 0.15;
        } else if (cookies > 12) {
            discountRate = 0.05;
        } else if (cookies > 6) {
            discountRate = 0.025;
        }

        double discountAmount = totalCost * discountRate;
        double finalCost = totalCost - discountAmount;

        System.out.printf("Your final total cost with the discount applied is $%.2f%n", finalCost);


        input.close();
    }

}
