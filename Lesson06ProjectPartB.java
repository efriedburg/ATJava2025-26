import java.util.Scanner;

public class Lesson06ProjectPartB {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter two floating point numbers separated by a space: ");
        double numberOne = in.nextDouble();
        double numberTwo = in.nextDouble();

        long numberOneRounded = Math.round(numberOne * 100.0);
        long numberTwoRounded = Math.round(numberTwo * 100.0);

        if (numberOneRounded == numberTwoRounded) {
            System.out.println("The numbers are equal up to two decimal places.");
        } else {
            System.out.println("The numbers are not equal up to two decimal places.");
        }

}

}