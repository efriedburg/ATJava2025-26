import java.util.Scanner;

public class HW06PartB {
    
    public static void main(String[] args) {
        
        //Prompt user for age
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        //Are they lucky?
        if (age == 13) {
            System.out.println("Lucky 13!");
        } 
        input.close();
    }

}
