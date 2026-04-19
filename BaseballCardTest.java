public class BaseballCardTest {
    public static void main(String[] args) {
        BaseballCard card1 = new BaseballCard("Aaron Judge", 2022);
        BaseballCard card2 = new BaseballCard("Aaron Judge", 2022);
        BaseballCard card3 = new BaseballCard("Shohei Ohtani", 2023);

        System.out.println(card1);
        System.out.println(card3);

        System.out.println("card1 equals card2: " + card1.equals(card2));
        System.out.println("card1 equals card3: " + card1.equals(card3));
    }
}