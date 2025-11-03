import java.util.Scanner;

public class Unit02ChallengeProblemsPartB {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your phone number in 10-digit format: ");
        String phoneNumber = in.nextLine();

        String areaCode = phoneNumber.substring(0, 3);
        String middleThree = phoneNumber.substring(3, 6);
        String lastFour = phoneNumber.substring(6, 10);

        System.out.println("Your formatted phone number is: (" + areaCode + ") " + middleThree + "-" + lastFour);
    }

}
