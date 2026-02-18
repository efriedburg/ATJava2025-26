import java.util.Scanner;

public class HW23PartA {
    public static int getQuizScore(Scanner in) {
        System.out.print("Enter a quiz score from 0 to 100: ");

        String input = in.nextLine();
        int score = Integer.parseInt(input);

        if (score < 0 || score > 100) {
            throw new NumberFormatException();
        }

        return score;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            int score = getQuizScore(in);
            System.out.println("You entered: " + score);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid quiz score.");
        }
        in.close();
    }
}
