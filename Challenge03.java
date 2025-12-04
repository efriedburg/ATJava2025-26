import java.util.Scanner;

public class Challenge03 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        boolean isPrime = true;

        if (integer <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(integer); i++) {
                if (integer % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(integer + " is a prime number!");
        } else {
            System.out.println(integer + " is not a prime number.");
        }

        input.close();

    }

}
