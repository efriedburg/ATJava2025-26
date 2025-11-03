// Not sure how to set the range for the values, I tried to use 

import java.util.Scanner;

public class HW04_PartA {

    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("Enter the first account ID: ");
    int id1 = in.nextInt();

    System.out.printf("Enter the account balance for ID = %06d ($): ", id1);
    double balance1 = in.nextDouble();

    System.out.print("Enter the second account ID: ");
    int id2 = in.nextInt();

    System.out.printf("Enter the account balance for ID = %06d ($): ", id2);
    double balance2 = in.nextDouble();

    System.out.print("Enter the third account ID: ");
    int id3 = in.nextInt();

    System.out.printf("Enter the account balance for ID = %06d ($): ", id3);
    double balance3 = in.nextDouble();

    System.out.printf("Account #%06d has a balance of $%,12.2f%n", id1, balance1);
    System.out.printf("Account #%06d has a balance of $%,12.2f%n", id2, balance2);
    System.out.printf("Account #%06d has a balance of $%,12.2f%n", id3, balance3);

    in.close();
}

}
