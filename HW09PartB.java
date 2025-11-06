import java.util.Scanner;

public class HW09PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a phrase: ");
        String phrase = in.nextLine();

        int count = 0;

        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            if (ch == 'e' || ch == 'E') {
                count++;
            }
        }
        System.out.println("The letter 'e' appears " + count + " times.");
    }


}
