//Ethan Friedburg
//AT Java Fall 2025
//HW #01

import java.awt.Toolkit;
import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hi, " + name + "!");

        System.out.print("Enter your favorite dessert: ");
        String food = in.nextLine();
        System.out.println(food + " is the best!");
    }
    
}
