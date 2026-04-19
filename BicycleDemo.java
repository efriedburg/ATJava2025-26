public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle regularBike = new Bicycle();
        GearedBicycle gearedBike = new GearedBicycle();

        gearedBike.setGear(2);

        // speed both bikes up
        for (int i = 0; i < 5; i++) {
            regularBike.accelerate();
            gearedBike.accelerate();
        }

        System.out.println("Before braking:");
        System.out.println("Regular bicycle speed: " + regularBike.getSpeed());
        System.out.println("Geared bicycle speed: " + gearedBike.getSpeed());

        // brake once
        regularBike.brake();
        gearedBike.brake();

        System.out.println();
        System.out.println("After braking once:");
        System.out.println("Regular bicycle speed: " + regularBike.getSpeed());
        System.out.println("Geared bicycle speed: " + gearedBike.getSpeed());
    }
}