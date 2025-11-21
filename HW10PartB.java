import java.util.Scanner;

public class HW10PartB {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of cookies: ");
        int num = in.nextInt();
        double discount = 0.0; // Added default discount; this is a compile-time error.
        if (num > 12) {
            discount = 0.10;
        } else if (num > 6) {
            discount = 0.05; // Switched the order of the conditions to make it run correctly, this is a logic error.
        }
        System.out.println("Discount = " + discount);  
    }
}