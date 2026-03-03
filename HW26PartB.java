// The previous code gives an output of:
// Before: 0
// After: 0
// A fixed version of the code can be seen below:

class Item {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
public class HW26PartB {
    public static void main(String[] args) {
        Item myItem = new Item();
        System.out.println("Before: " + myItem.getValue());
        myItem.setValue(13);
        System.out.println("After: " + myItem.getValue());
    }
}
