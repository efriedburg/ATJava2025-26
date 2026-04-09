// Package: java.time
// Parent Package: java

import java.time.LocalDate;
import java.time.LocalTime;

public class HW27PartA {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        System.out.println("Today's date is " + today);
        System.out.println("The current time is " + now);
    }
}