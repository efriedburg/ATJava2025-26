public class Challenge02 {
    
    public static void main(String[] args) {
        
        int firstDie;
        int secondDie;

        do {

            firstDie = (int)(Math.random() * 6) + 1;
            secondDie = (int)(Math.random() * 6) + 1;

            System.out.println(firstDie + " and " + secondDie);
        } while (firstDie != secondDie);
        System.out.println("The dice are the same!");


    }

}
