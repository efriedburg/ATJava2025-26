import java.util.Scanner;

public class HW13PartC {
    
    public static boolean isVowel(char ch)

    {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static int countVowels(String phrase) {

    int count = 0;

        for (int i = 0; i < phrase.length(); i++) {
            if (isVowel(phrase.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String inputPhrase = scanner.nextLine();

        int totalVowels = countVowels(inputPhrase);

        System.out.println("The number of vowels in the phrase is: " + totalVowels);

        scanner.close();
    }

}
