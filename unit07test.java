import java.io.File;
import java.util.Scanner;

public class unit07test {
    public static void main(String[] args) throws Exception {
        
        double total = 0;
        int count = 0;

        Scanner input = new Scanner(new File("mathmeet.txt"));
        input.useDelimiter("\\s*,\\s*|\\R");

        System.out.println("Name           |  School                       |  Score");
        System.out.println("-------------------------------------------------------");

        while (input.hasNext()) {
            String name = input.next();
            String school = input.next();
            double score = input.nextDouble();

            System.out.printf("%-15s|  %-29s|  %.1f\n", name, school, score);

            total += score;
            count++;
        }
    double average = total / count;
    

    System.out.println("-------------------------------------------------------");
    System.out.printf("Average Score: %.1f\n", average);
        

        input.close();
}
}
