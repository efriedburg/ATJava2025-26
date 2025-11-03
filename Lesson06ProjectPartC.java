import java.util.Scanner;
import java.util.Arrays;

public class Lesson06ProjectPartC {

    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    System.out.print("Enter three strings in the same line separated by spaces: ");
    String str1 = in.next();
    String str2 = in.next();
    String str3 = in.next();
    String[] strings = {str1, str2, str3};

    Arrays.sort(strings, (x, y) -> {
        int ci = x.compareToIgnoreCase(y);
        return (ci !=0) ? ci : x.compareTo(y);
    });

    System.out.println("Strings in alphabetical order:");
    for (String s : strings) {
        System.out.println(s);
    }

}

}