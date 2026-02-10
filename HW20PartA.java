import java.io.File;
import java.util.Scanner;

public class HW20PartA {
    public static void main(String[] args) throws Exception{
        
        Scanner input = new Scanner(new File("customerdata.txt"));
        input.useDelimiter("[,\\s\\n]+");

        System.out.println("---------------------------------------");
        System.out.println("   ID  |    Name    |     Balance");
        System.out.println("---------------------------------------");

        while (input.hasNext()) {
            int id = input.nextInt();
            String name = input.next();
            double balance = input.nextDouble();

            String idText = "" + id;
            while (idText.length() < 6) {
                idText = "0" + idText;
            }

            System.out.printf("%06d | %10s | $%16.2f\n", id, name, balance);
        }

        input.close();
    }
}
