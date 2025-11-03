import java.util.Scanner;

public class Lesson06ProjectPartA {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a temperature and a 'C' for Celsius or 'F' for Fahrenheit: ");
        double temperature = in.nextDouble();
        String scale = in.next().toUpperCase();

        double freezing;
        double boiling;

        if (scale.equals("C")) {
            freezing = 0.0;
            boiling = 100.0;
        } else if (scale.equals("F")) {
            freezing = 32.0;
            boiling = 212.0;
        } else {
            System.out.println("Invalid scale entered.");
            return;
        }

        if (temperature <= freezing) {
            System.out.println("The substance is a solid at this temperature.");
        } else if (temperature >= boiling) {
            System.out.println("The substance is a gas at this temperature.");
        } else {
            System.out.println("The substance is a liquid at this temperature.");
        }
}

}