import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack {

    public static int getScore(ArrayList<Card> hand) {
        int score = 0;
        int aces = 0;

        for (int i = 0; i < hand.size(); i++) {
            Card.Rank rank = hand.get(i).getRank();

            if (rank == Card.Rank.TWO) score += 2;
            else if (rank == Card.Rank.THREE) score += 3;
            else if (rank == Card.Rank.FOUR) score += 4;
            else if (rank == Card.Rank.FIVE) score += 5;
            else if (rank == Card.Rank.SIX) score += 6;
            else if (rank == Card.Rank.SEVEN) score += 7;
            else if (rank == Card.Rank.EIGHT) score += 8;
            else if (rank == Card.Rank.NINE) score += 9;
            else if (rank == Card.Rank.TEN || rank == Card.Rank.JACK || rank == Card.Rank.QUEEN || rank == Card.Rank.KING) {
                score += 10;
            } else if (rank == Card.Rank.ACE) {
                score += 11;
                aces++;
            }
        }

        while (score > 21 && aces > 0) {
            score -= 10;
            aces--;
        }

        return score;
    }

    public static void showPlayerHand(ArrayList<Card> hand) {
        System.out.print("Player: ");
        for (int i = 0; i < hand.size(); i++) {
            System.out.print(hand.get(i).getFace() + " ");
        }
        System.out.println();
        System.out.println("Score: " + getScore(hand));
    }

    public static void showDealerHand(ArrayList<Card> hand, boolean hideSecond) {
        System.out.print("Dealer: ");
        for (int i = 0; i < hand.size(); i++) {
            if (i == 1 && hideSecond) {
                System.out.print("[hidden] ");
            } else {
                System.out.print(hand.get(i).getFace() + " ");
            }
        }
        System.out.println();
        if (!hideSecond) {
            System.out.println("Score: " + getScore(hand));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String play = "yes";

        while (play.equalsIgnoreCase("yes")) {
            ArrayList<Card> playerHand = new ArrayList<Card>();
            ArrayList<Card> dealerHand = new ArrayList<Card>();

            playerHand.add(new Card());
            dealerHand.add(new Card());
            playerHand.add(new Card());
            dealerHand.add(new Card());

            showDealerHand(dealerHand, true);
            showPlayerHand(playerHand);

            int playerScore = getScore(playerHand);
            int dealerScore = getScore(dealerHand);

            boolean handOver = false;

            if (dealerScore == 21 && playerScore != 21) {
                showDealerHand(dealerHand, false);
                System.out.println("Dealer has 21. You lose.");
                handOver = true;
            } else if (playerScore == 21 && dealerScore != 21) {
                showDealerHand(dealerHand, false);
                System.out.println("You have 21. You win.");
                handOver = true;
            } else if (playerScore == 21 && dealerScore == 21) {
                showDealerHand(dealerHand, false);
                System.out.println("Draw.");
                handOver = true;
            }

            while (!handOver) {
                System.out.print("Hit or stand? ");
                String choice = input.nextLine();

                if (choice.equalsIgnoreCase("hit")) {
                    playerHand.add(new Card());
                    showDealerHand(dealerHand, true);
                    showPlayerHand(playerHand);

                    if (getScore(playerHand) > 21) {
                        System.out.println("You busted. Dealer wins.");
                        handOver = true;
                    }
                } else if (choice.equalsIgnoreCase("stand")) {
                    break;
                } else {
                    System.out.println("Type hit or stand.");
                }
            }

            if (!handOver) {
                showDealerHand(dealerHand, false);

                while (getScore(dealerHand) < 17) {
                    System.out.println("Dealer hits.");
                    dealerHand.add(new Card());
                    showDealerHand(dealerHand, false);
                }

                int finalPlayer = getScore(playerHand);
                int finalDealer = getScore(dealerHand);

                if (finalDealer > 21) {
                    System.out.println("Dealer busted. You win.");
                } else if (finalPlayer > finalDealer) {
                    System.out.println("You win.");
                } else if (finalDealer > finalPlayer) {
                    System.out.println("Dealer wins.");
                } else {
                    System.out.println("Draw.");
                }
            }

            System.out.print("Play again? yes or no: ");
            play = input.nextLine();
        }

        System.out.println("Thanks for playing.");
        input.close();
    }
}