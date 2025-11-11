import java.util.Scanner;

public class Unit03Project {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("name: ");
        String name = in.nextLine();

        System.out.print("day: ");
        String day = in.nextLine();

        System.out.print("time: ");
        String time = in.nextLine();

        System.out.print("age: ");
        if (!in.hasNextInt()) {
            System.out.println("Invalid input for age. Please enter a number.");
            return;
        }
        int age = in.nextInt();
        System.out.print("student (y/n): ");
        String s = in.next();
        boolean isStudent = false;
        if (s.equalsIgnoreCase("y")) {
            isStudent = true;
        } else if (s.equalsIgnoreCase("n")) {
            isStudent = false;
        } else {
            System.out.println("Invalid input for student status. Please enter 'y' or 'n'.");
            return;
        }

        if (!time.contains(":")) {
            System.out.println("Invalid time format. Please include a colon (:) in the time.");
            return;
        }

        int colon = time.indexOf(":");
        String h = time.substring(0, colon);
        String m = time.substring(colon + 1);
        int hour = Integer.parseInt(h);
        int minute = Integer.parseInt(m);

        String d = day.toLowerCase();
        double base = 0;
        boolean rush = false;
        if (d.startsWith("mon") || d.startsWith("tue") || d.startsWith("wed") || d.startsWith("thu") || d.startsWith("fri")) {
            if ((hour == 6 && minute >= 0) || (hour == 7 && minute <= 59) || (hour == 16 && minute >= 0) || (hour == 17 && minute <= 59)) {
                base = 100;
                rush = true;
            } else {
                base = 90;
            }
        } else if (d.startsWith("sat") || d.startsWith("sun")) {
            base = 80;
        } else {
            System.out.println("Invalid day input.");
            return;
        }

        double discount = 0;
        String ageType = "";

        if (age >= 0 && age <= 2) {
            System.out.println("------------------------------------------------------");
            System.out.println("Name: " + name);
            System.out.println("Day: " + day.toUpperCase());
            System.out.println("Time: " + time);
            System.out.println("------------------------------------------------------");
            System.out.println("Base Price: $0.00 (FREE BABY)");
            System.out.println("Age Discount: $0.00 (BABY)");
            System.out.println("Student Discount: $0.00");
            System.out.println("------------------------------------------------------");
            System.out.println("Final Cost: $0.00");
            System.out.println("------------------------------------------------------");
            return;

        } else if (age >= 3 && age <= 12) {
            discount = base * 0.2;
            ageType = "CHILD";
        } else if (age >= 13 && age <= 59) {
            discount += 0;
            ageType = "ADULT";
    
            ageType = "ADULT";
        } else if (age >= 60) {
            discount = base * 0.25;
            ageType = "SENIOR";
        } else {
            System.out.println("Invalid age input.");
            return;
        }

        double afterAgeDiscount = base - discount;
        double studentDiscount = 0;
        if (isStudent) {
            studentDiscount = afterAgeDiscount * 0.05;
        }

        double finalCost = afterAgeDiscount - studentDiscount;

        System.out.println("------------------------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Day: " + day.toUpperCase());
        System.out.println("Time: " + time);
        System.out.println("------------------------------------------------------");
        if (rush) {
            System.out.printf("Base Price: $%.2f (RUSH HOUR)\n", base);
        } else {
            System.out.printf("Base Price: $%.2f\n", base);
        }
        System.out.printf("Age Discount: $%.2f (%s)\n", -discount, ageType);
        System.out.printf("Student Discount: $%.2f\n", -studentDiscount);
        System.out.println("------------------------------------------------------");
        System.out.printf("Final Cost: $%.2f\n", finalCost);
        System.out.println("------------------------------------------------------");
        }
    }
