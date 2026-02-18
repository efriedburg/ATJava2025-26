public class Counter {
    private int value = 0;

    public void getValue() {
        value++;
    }

    public int count() {
        return value;
    }

    public void reset() {
        value = 0;
    }
}