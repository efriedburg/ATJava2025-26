import java.util.Scanner;

public class HW11PartC {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = input.nextDouble();

        double volume = sphereVolume(radius);

        System.out.println("The volume of the sphere is: " + volume);

}

    public static double sphereVolume(double r) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        return volume;
    }
}

