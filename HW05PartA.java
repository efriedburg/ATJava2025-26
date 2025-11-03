import java.util.Scanner;

public class HW05PartA {
    

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your first, middle, and last name: ");

        String firstName = in.next();
        String middleName = in.next();
        String lastName = in.next();

        String letters = firstName.substring(0,1)
        + middleName.substring(0,1)
        + lastName.substring(0,1);

        System.out.println("Your monogram is " + letters + "!");

        in.close();

    }
}
