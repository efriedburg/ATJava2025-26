import java.util.Scanner;

public class HW04_PartB {

    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("Enter the length, width, and height (cm) of the box: ");

    double length = in.nextDouble();
    double width = in.nextDouble();
    double height = in.nextDouble();

    double surface = 2 * (length * width + width * height + height * length);
    double volume = length * width * height;

    System.out.printf("%-16s = %12.2f%n", "length (cm)", length);
    System.out.printf("%-16s = %12.2f%n", "width (cm)", width);
    System.out.printf("%-16s = %12.2f%n", "height (cm)", height);
    System.out.printf("%-16s = %12.2f%n", "surface area (sq cm)", surface);
    System.out.printf("%-16s = %12.2f%n", "volume (cu cm)", volume);

    in.close();

}

}