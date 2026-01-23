public class HW17PartB {
    
    public static void main(String[] args) {
        
        int[][] array1 = {
            {8, 6, 7},
            {5, 3, 0},
        };

        int[][] array2 = {
            {0, 7, 6, 5},
            {2, 2, 0, 1},
            {8, 4, 5, 7}
        };

        System.out.println("First Array: ");
        print(array1);

        System.out.println("Second Array: ");
        print(array2);
    }

    public static void print(int[][] values) {
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                System.out.print(values[row][col] + ", ");
            }
            System.out.println();
        }
    }
}
