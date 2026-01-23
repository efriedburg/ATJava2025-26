import java.util.ArrayList;
import java.util.Scanner;

public class HW18PartA {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();

        while (true)
        {
            System.out.print("Enter a name (or # to finish): ");
            String input = in.nextLine();
            if (input.equals("#")) {
                break;
            }
            names.add(input);
        }

    for (int i = 0; i < names.size(); i++) {
        System.out.println(names.get(i));

    }

    }

}