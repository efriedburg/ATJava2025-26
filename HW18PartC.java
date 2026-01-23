import java.util.ArrayList;
import java.util.Scanner;

public class HW18PartC {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> temperatures = new ArrayList<Integer>();

        while (true)
        {
            System.out.print("Enter a temperature (or q to finish): ");
            String input = in.nextLine();
            if (input.equals("q")) {
                break;
            }
            temperatures.add(Integer.parseInt(input));
        }
        int lowest = temperatures.get(0);

        for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) < lowest) {
                lowest = temperatures.get(i);
            }
        }

        for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) == lowest) {
                System.out.println(temperatures.get(i) + " <= lowest");
            }
            else {
                System.out.println(temperatures.get(i));
            }

        }

    }

}
