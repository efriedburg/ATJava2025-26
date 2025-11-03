import java.util.Scanner;

public class Unit02TestPartB {
    
public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the day of the week (0 = Sunday, 1 = Monday... 6= Saturday): ");
    int day = in.nextInt();

    System.out.print("Enter the number of days in the future: ");
    int futureDays = in.nextInt();

    int futureDay = (day + futureDays) % 7;
    System.out.println("In " + futureDays + " days, the day of the week will be " + futureDay);

    in.close();
}

}
