import java.util.Scanner;

public class HW15PartB {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] values = new int[20];
        int currentSize = 0;

        while (currentSize < values.length) {
            System.out.print("Enter an integer (or q to stop): ");

            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next();
                break;
            } else {
                values[currentSize] = input.nextInt();
                currentSize++;
            }
        }
        for (int i = 0; i <currentSize; i++) {
            System.out.print(values[i]);
            if (i <currentSize - 1) {
                System.out.print(", ");}
        }
    System.out.println();
    
    System.out.print("Enter a target integer value: ");
    int target = input.nextInt();

    int count = 0;
    for (int i = 0; i < currentSize; i++) {
        if (values[i] == target) {
            count++;
        }   
    }
    System.out.println("The value " + target + " appears " + count + " times in your original data set.");

}
}
