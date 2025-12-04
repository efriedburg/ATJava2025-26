import java.util.Scanner;

public class Challenge04 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number from 0 to 20: ");
        int number = input.nextInt();

        System.out.print("Progress: [");

        for (int i = 0; i < number; i++) {
            System.out.print("#");
        }
        for (int i = number; i < 20; i++) {
            System.out.print("-");
        }

        System.out.println("] " + (number * 5) + "%");

        input.close();
    }

}
