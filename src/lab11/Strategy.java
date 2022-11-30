package lab11;

import java.util.List;

public interface Strategy {
    /** Will be called when the deck is shuffled. */
    public void cardsShuffled();

    /** Will be called at the beginning of a new hand when a bet is needed. */
    public int getBet(int totalPlayerMoney);

    /** Will be called whenever the player is dealt a card. */
    public void playerDealtCard(Card playerCard);

    /** Will be called whenever the dealer is dealt a card. */
    public void dealerDealtCard(Card dealerCard);

    /** Will be called whenever a player must choose whether to HIT or STAND. */
    public Decision getDecision(List<Card> playerCards, List<Card> dealerCards);

    /** Will be called whenever hand is over.  Parameters are the outcome of the
     * hand, final player cards, final dealer cards, amount of money the player wins
     * (might be negative), and the total amount of money the player has right now.
     */
    public void endOfHand(Outcome outcome, List<Card> playerCards, List<Card> dealerCards,
                          int playerMoneyWon, int totalPlayerMoney);

}
