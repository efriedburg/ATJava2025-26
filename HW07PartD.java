import java.util.Scanner;

public class HW07PartD {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer from 1 to 3999: ");
        int number = input.nextInt();

        if (number < 1 || number > 3999) {
            System.out.println("Number is outside of range or not an integer.");
        } else {
            int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < values.length; i++) {
                while (number >= values[i]) {
                    result.append(romanNumerals[i]);
                    number -= values[i];
                }
            }
            System.out.println("Roman numeral: " + result.toString());
        }

        input.close();

    }

}
