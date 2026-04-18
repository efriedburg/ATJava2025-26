public class Main {
    public static void main(String[] args) {
        Executive exec = new Executive("Ethan", 100000, 20000, 1500.5);
        exec.displayInfo();

        System.out.println();

        exec.setShares(1750.0);
        exec.displayInfo();
    }
}
