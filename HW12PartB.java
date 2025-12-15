import java.util.Scanner;

public class HW12PartB {
    
    public static double smallest(double x, double y, double z) {

        double min = x;

        if (y < min) {
            min = y;
        }
        if (z < min) {
            min = z;
        }
        return min;

    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        double smallestNumber = smallest(num1, num2, num3);

        System.out.println("The smallest number is: " + smallestNumber);

        scanner.close();
    }
}