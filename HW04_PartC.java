import java.util.Scanner;

public class HW04_PartC {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final int TILE_WIDTH = 5;

        System.out.print("Enter the total wall width (inches): ");
        double totalWidth = in.nextDouble();

        int numberOfTiles = (int)(totalWidth / TILE_WIDTH);
        int leftoverSpace = (int)(totalWidth % TILE_WIDTH);
        double gapWidth = leftoverSpace / 2.0;
        int whiteTiles = numberOfTiles / 2;
        int blackTiles = numberOfTiles - whiteTiles;
        System.out.printf("Black tiles used: %d%n", blackTiles);
        System.out.printf("White tiles used: %d%n", whiteTiles);
        System.out.printf("Gap width (inches): %.2f%n", gapWidth);

        in.close();
    }

    }