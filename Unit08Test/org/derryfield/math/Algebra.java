package org.derryfield.math;

public class Algebra {


    public static double harmonicMean(double x, double y) {
        if (x <= 0|| y <= 0) {
            throw new ArithmeticException("Both numbers must be positive.");
        }

        if (x + y == 0) {
            throw new ArithmeticException("The sum of the numbers can't be zero.");
        }

        return (2 * x * y )/ (x + y);
    }
}