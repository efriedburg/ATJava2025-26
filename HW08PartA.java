public class HW08PartA {

    public static void main(String[] args) {

        double materialPercent = 100.0;
        int years = 0;
        int halflife = 30;

        while (materialPercent > 1.0) {
            materialPercent /= 2;
            years += halflife;
        }

        System.out.printf("Years required: %d years%n", years);
        System.out.printf("Material remaining: %.2f%%%n", materialPercent);

    }

}