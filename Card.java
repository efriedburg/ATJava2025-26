public class Card {

    public enum Suit {
        SPADE, HEART, CLUB, DIAMOND
    }

    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
        TEN, JACK, QUEEN, KING, ACE
    }

    private Suit cardSuit;
    private Rank cardRank;

    public Card() {
        Suit[] allSuits = Suit.values();
        Rank[] allRanks = Rank.values();
        cardSuit = allSuits[(int) (Math.random() * allSuits.length)];
        cardRank = allRanks[(int) (Math.random() * allRanks.length)];
    }

    public Card(Suit suitInput, Rank rankInput) {
        cardSuit = suitInput;
        cardRank = rankInput;
    }

    public Suit getSuit() {
        return cardSuit;
    }

    public Rank getRank() {
        return cardRank;
    }

    public String getFace() {
        char suitSymbol = ' ';
        if (cardSuit == Suit.SPADE) suitSymbol = '\u2660';
        else if (cardSuit == Suit.HEART) suitSymbol = '\u2661';
        else if (cardSuit == Suit.CLUB) suitSymbol = '\u2663';
        else if (cardSuit == Suit.DIAMOND) suitSymbol = '\u2662';

        char rankSymbol = ' ';
        if (cardRank == Rank.TWO) rankSymbol = '2';
        else if (cardRank == Rank.THREE) rankSymbol = '3';
        else if (cardRank == Rank.FOUR) rankSymbol = '4';
        else if (cardRank == Rank.FIVE) rankSymbol = '5';
        else if (cardRank == Rank.SIX) rankSymbol = '6';
        else if (cardRank == Rank.SEVEN) rankSymbol = '7';
        else if (cardRank == Rank.EIGHT) rankSymbol = '8';
        else if (cardRank == Rank.NINE) rankSymbol = '9';
        else if (cardRank == Rank.TEN) rankSymbol = 'T';
        else if (cardRank == Rank.JACK) rankSymbol = 'J';
        else if (cardRank == Rank.QUEEN) rankSymbol = 'Q';
        else if (cardRank == Rank.KING) rankSymbol = 'K';
        else if (cardRank == Rank.ACE) rankSymbol = 'A';

        return "" + suitSymbol + rankSymbol;
    }

    public static void main(String[] args) {
        Card queenOfHearts = new Card(Suit.HEART, Rank.QUEEN);
        System.out.println("The following card should be the queen of hearts,");
        System.out.println("  " + queenOfHearts.getFace());

        System.out.println();
        System.out.println("10 random cards...");
        for (int i = 0; i < 10; i++) {
            Card randomCard = new Card();
            System.out.println("  " + randomCard.getFace());
        }
    }
}