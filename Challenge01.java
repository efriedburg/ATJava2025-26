import java.util.Scanner;

public class Challenge01 {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String firstWord = input.nextLine();

        boolean isPalindrome = true;
        int left = 0;
        int right = firstWord.length() - 1;

        while (left < right) {
            if (firstWord.charAt(left) != firstWord.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("This is a palindrome!");
        } else {
            System.out.println("This is not a palindrome.");
        }
        input.close();
    }
}
