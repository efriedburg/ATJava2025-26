import java.util.Scanner;

public class HW07PartB {

    enum CustomerType {
        CHILD, SENIOR, ADULT
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Is today monday? (yes/no): ");
        String isMonday = input.nextLine().trim().toLowerCase();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter the cost of the meal: ");
        double cost = input.nextDouble();

        double discount = 0.0;

        CustomerType customerType;
        if (age < 13) {
            customerType = CustomerType.CHILD;
        } else if (age >= 50) {
            customerType = CustomerType.SENIOR;
        } else {
            customerType = CustomerType.ADULT;
        }

        if (isMonday.equals("yes")) {
            if (customerType == CustomerType.CHILD) {
                discount = 0.075;
            } else if (customerType == CustomerType.SENIOR) {
                discount = 0.15;
            } else {
                discount = 0.05;
            }
        } else {
            if (customerType == CustomerType.CHILD) {
                discount = 0.05;
            } else if (customerType == CustomerType.SENIOR) {
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
    

