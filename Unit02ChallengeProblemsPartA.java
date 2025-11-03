import java.util.Scanner;

public class Unit02ChallengeProblemsPartA {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your amount in dollar and cents format: ");
        double price = in.nextDouble();

        int dollars = (int) price;
        int cents = (int) Math.round((price - dollars) * 100);

        System.out.println("You have " + dollars + " dollars and " + cents + " cents!");

    }

}