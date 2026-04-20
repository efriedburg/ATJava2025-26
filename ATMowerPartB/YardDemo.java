import mow.Yard;
import mow.Mower;

public class YardDemo {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
    }

    public static void main(String[] args) {
        Yard yard = new Yard(5, 25);
        Mower mower = new Mower(3, 1, 1);

        while (yard.getCell(mower.getRow(), mower.getCol()) != 'R'
                && mower.senseFront(yard) != 'R') {
            mower.cutGrass(yard);
            clearScreen();
            yard.printYard(mower);
            delay(500);
            mower.moveForward();
        }

        mower.cutGrass(yard);
        clearScreen();
        yard.printYard(mower);
    }
}