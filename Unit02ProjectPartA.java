import java.util.Scanner;

public class Unit02ProjectPartA {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of movies you have rented: ");
        int rentals = in.nextInt();

        System.out.print("Enter the number of members you have referred: ");
        int referrals = in.nextInt();

        int discount = rentals + referrals;

        if (discount > 75) {
            discount = 75;
        } else {

        }

        System.out.println("Your discount is " + discount + "%!");
        }

    }

