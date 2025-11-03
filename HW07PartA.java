import java.util.Scanner;

public class HW07PartA {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Is today monday? (yes/no): ");
        String isMonday = input.nextLine().trim().toLowerCase();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter the cost of the meal: ");
        double cost = input.nextDouble();

        double discount = 0.0;

        if (isMonday.equals("yes")) {
            if (age < 13) {
                discount = 0.075;
            } else if (age >= 50) {
                discount = 0.15;
            } else {
                discount = 0.05;
            }
        } else {
            if (age < 13) {
                discount = 0.05;
            } else if (age >= 50) {
                discount = 0.075;
            } else {
                discount = 0.0;
            }

        }

        double dicountAmount = cost * discount;
        double finalCost = cost - dicountAmount;

        System.out.printf("Your final cost is $%.2f%n", finalCost);

        input.close();
        
        }

    }
    
