package lab11;

import java.util.List;
import java.util.Scanner;

public class InteractiveStrategy implements Strategy {
    @Override
    public void cardsShuffled() {
        System.out.println("Cards being reshuffled.");
    }

    @Override
    public int getBet(int totalPlayerMoney) {
        System.out.println("New hand beginning.  You have " + totalPlayerMoney + " dollars.");
        System.out.print("How much do you want to bet? ");
        Scanner scan = new Scanner(System.in);
        int bet = scan.nextInt();
        return bet;
    }

    @Override
    public void playerDealtCard(Card playerCard) {
        System.out.println("Player receives: " + playerCard);
    }

    @Override
    public void dealerDealtCard(Card dealerCard) {
        System.out.println("Dealer receives: " + dealerCard);
    }

    @Override
    public Decision getDecision(List<Card> playerCards, List<Card> dealerCards) {
        System.out.println("Dealer hand: " + dealerCards + " Value: "
                + Blackjack.getValue(dealerCards) + " " + Blackjack.getValueAsString(dealerCards));
        System.out.println("Player hand: " + playerCards + " Value: "
                + Blackjack.getValue(playerCards) + " " + Blackjack.getValueAsString(playerCards));

        Scanner scan = new Scanner(System.in);
        System.out.print("0 to stand, 1 to hit: ");
        int choice = scan.nextInt();
        if (choice == 0) return Decision.STAND; else return Decision.HIT;
    }

    @Override
    public void endOfHand(Outcome outcome, List<Card> playerCards, List<Card> dealerCards, int playerMoneyWon, int playerMoneyTotal) {
        System.out.println("Outcome: " + outcome);
        System.out.println("Final dealer hand: " + dealerCards + " Value: "
                + Blackjack.getValue(dealerCards) + " " + Blackjack.getValueAsString(dealerCards));
        System.out.println("Final player hand: " + playerCards + " Value: "
                + Blackjack.getValue(playerCards) + " " + Blackjack.getValueAsString(playerCards));
        System.out.println("Money received: " + playerMoneyWon);
    }
}
