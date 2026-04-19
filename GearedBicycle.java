public class GearedBicycle extends Bicycle {
    private int gear;

    public GearedBicycle() {
        gear = 1;
    }

    public void setGear(int newGear) {
        gear = newGear;
    }

    public int getGear() {
        return gear;
    }

    @Override
    public void accelerate() {
        for (int i = 0; i < gear; i++) {
            super.accelerate();
        }
    }

    @Override
    public void brake() {
        super.brake();
        super.brake();
    }
}