import java.util.ArrayList;
import java.util.Scanner;

public class HW18PartD {
    
    public static void main(String[] args) {
    
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer (or q to finish): ");

        while (in.hasNextInt()) {
            numbers.add(in.nextInt());
        }

        for (int i = 0; i < numbers.size(); ) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            } else {
                i++;
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }

}