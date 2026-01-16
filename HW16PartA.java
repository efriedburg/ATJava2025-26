import java.util.Scanner;

public class HW16PartA {
    
    public class cleanup {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            String[] words = new String[20];
            int size = 0;

            while (true) {
                System.out.print("Enter a word or phrase (or enter q to quit)");
                String input = in.nextLine();

                if (input.equals("q")) {
                    break;
                }

                words[size] = input;
                size++;
            }

            System.out.println("Words/Phrases (current size = " + size + "):");
            for (int i = 0; i < size; i++) {
                System.out.println(words[i]);
            }  
        
                cleanup(words, size);
            System.out.println("Modified array...");
            System.out.println("Words/Phrases (current size = " + size + "):");

            for (int i = 0; i < size; i++) {
                System.out.println(" " + words[i]);
            }
            }

        public static void cleanup(String[] list, int size) {
            for (int i = 0; i < size; i++) {
                String s = list[i].trim();
                s = s.toLowerCase();

                if (s.length() > 0) {
                    s = s.substring(0, 1).toUpperCase() + s.substring(1);
                }

                list[i] = s;

            }
        }
    }
}