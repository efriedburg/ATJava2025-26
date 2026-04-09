public class Die{
    private int value;

    public Die(){
        roll();

    }

    public Die (int value) {
        setValue(value);
    }

    public void roll() {
        value = (int)(Math.random() * 6) + 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < 1 || value > 6) {
            throw new IllegalArgumentException("Value must be between 1 and 6");
        }
        this.value = value;
    }

    public void display() {
        switch (value) {
            case 1:
                System.out.println("+-------+");
                System.out.println("|       |");
                System.out.println("|   0   |");
                System.out.println("|       |");
                System.out.println("+-------+");
                break;
            case 2:
                System.out.println("+-------+");
                System.out.println("| 0     |");
                System.out.println("|       |");
                System.out.println("|     0 |");
                System.out.println("+-------+");
                break;
            case 3:
                System.out.println("+-------+");
                System.out.println("| 0     |");
                System.out.println("|   0   |");
                System.out.println("|     0 |");
                System.out.println("+-------+");
                break;
            case 4:
                System.out.println("+-------+");
                System.out.println("| 0   0 |");
                System.out.println("|       |");
                System.out.println("| 0   0 |");
                System.out.println("+-------+");
                break;
            case 5:
                System.out.println("+-------+");
                System.out.println("| 0   0 |");
                System.out.println("|   0   |");
                System.out.println("| 0   0 |");
                System.out.println("+-------+");
                break;
            case 6:
                System.out.println("+-------+");
                System.out.println("| 0   0 |");
                System.out.println("| 0   0 |");
                System.out.println("| 0   0 |");
                System.out.println("+-------+");
                break;
            default:
                System.out.println("Invalid die value");
        }
    }

}