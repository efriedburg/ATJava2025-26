import java.util.Arrays;

public class Test0506Part1 {
    public static void swap(int i, int j, int arr[]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        swap(2, 7, numbers);
        System.out.println(Arrays.toString(numbers));
    }
}