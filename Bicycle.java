public class Bicycle {
    private int speed;

    public Bicycle() {
        speed = 0;
    }

    public void accelerate() {
        speed = speed + 1;
    }

    public void brake() {
        if (speed > 0) {
            speed = speed - 1;
        }
    }

    public int getSpeed() {
        return speed;
    }
}