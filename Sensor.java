public abstract class Sensor {

    private String name;
    private int modelNumber;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for modelNumber
    public int getModelNumber() {
        return modelNumber;
    }

    // Setter for modelNumber
    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    // Abstract method (no body)
    public abstract void recordMeasurement();
}