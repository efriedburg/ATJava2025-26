import java.util.Scanner;

public class HW06PartA {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        final double PIE_PRICE = 10.00;
        final double DISCOUNT_RATE = 0.10;

        System.out.print("Enter the number of pies you would like to buy: ");
        int numberOfPies = in.nextInt();

        double totalCost;

        if (numberOfPies >= 3) {
            totalCost = numberOfPies * PIE_PRICE * (1 - DISCOUNT_RATE);
            System.out.println("Congratulations! You qualify for a discount!");
        } else {
            totalCost = numberOfPies * PIE_PRICE;
        }

        System.out.printf("Your total cost is: $%.2f%n", totalCost);
    }

}
