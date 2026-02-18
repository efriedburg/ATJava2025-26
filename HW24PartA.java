import java.util.Scanner;

public class HW24PartA {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.println("You are " + age + " years old.");
    
    }
}