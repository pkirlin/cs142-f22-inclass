package lab11;

import java.util.ArrayList;
import java.util.List;

public class Blackjack {

    private int playerMoney;  // how much money we have
    private List<Card> cardsToDeal;  // cards left to deal
    private Strategy playerStrategy;  // the strategy the player will use

    /** Create a new blackjack game with a given strategy. */
    public Blackjack(Strategy s)
    {
        playerMoney = 10000;
        cardsToDeal = Card.generateShuffledDeck();
        playerStrategy = s;
    }

    /** Run a certain number of hands of blackjack. */
    public int playHands(int numHands)
    {
        for (int i = 0; i < numHands; i++)
        {
            playOneHand();
        }
        return playerMoney;
    }

    /** Run 1 hand of blackjack. */
    public void playOneHand()
    {
        if (cardsToDeal.size() < 10) {
            cardsToDeal = Card.generateShuffledDeck();
            playerStrategy.cardsShuffled();  // alert player to newly-shuffled cards
        }

        List<Card> playerCards = new ArrayList<Card>();
        List<Card> dealerCards = new ArrayList<Card>();

        int playerBet = playerStrategy.getBet(playerMoney);
        Card card;

        // give player their first card

        card = dealACard();
        playerCards.add(card);
        playerStrategy.playerDealtCard(card);
        // give dealer their first card
        card = dealACard();
        dealerCards.add(card);
        playerStrategy.dealerDealtCard(card);
        // give player their second card
        card = dealACard();
        playerCards.add(card);
        playerStrategy.playerDealtCard(card);

        // handle player's cards
        boolean playerBust = false;
        // does player have blackjack?
        if (getValue(playerCards) == 21) {
            // player wins if dealer doesn't have blackjack
            // give dealer their second card
            card = dealACard();
            dealerCards.add(card);
            playerStrategy.dealerDealtCard(card);
            if (getValue(dealerCards) != 21) {
                // player blackjack, dealer no blackjack, player wins
                playerMoney += (1.5 * playerBet);
                playerStrategy.endOfHand(Outcome.PLAYER_WIN,
                        playerCards, dealerCards, (int)(1.5 * playerBet), playerMoney);
            }
            else {
                // both player and dealer have blackjack, so tie
                playerStrategy.endOfHand(Outcome.TIE,
                        playerCards, dealerCards, 0, playerMoney);

            }
            return; // end of player blackjack section
        }

        // give player new cards while they want them
        Decision playerDecision = null;
        do {
            playerDecision = playerStrategy.getDecision(playerCards, dealerCards);
            if (playerDecision == Decision.HIT) {
                card = dealACard();
                playerCards.add(card);
                playerStrategy.playerDealtCard(card);

                // detect player bust
                if (getValue(playerCards) > 21) {
                    playerMoney -= playerBet;
                    playerStrategy.endOfHand(Outcome.PLAYER_LOSS,
                            playerCards, dealerCards, -playerBet, playerMoney);
                    playerBust = true;
                    return;
                }
            }
        } while (playerDecision == Decision.HIT && getValue(playerCards) < 21);

        // handle dealer's cards
        if (!playerBust) {
            // dealer must take cards until 17, 18, 19, 20, 21, or bust
            while (getValue(dealerCards) <= 16) {
                card = dealACard();
                dealerCards.add(card);
                playerStrategy.dealerDealtCard(card);
            }
            int playerValue = getValue(playerCards);
            int dealerValue = getValue(dealerCards);

            // check for dealer blackjack
            if (dealerCards.size() == 2 && dealerValue == 21) {
                playerMoney -= playerBet;
                playerStrategy.endOfHand(Outcome.PLAYER_LOSS, playerCards, dealerCards, -playerBet, playerMoney);
            }
            // check for dealer bust
            else if (dealerValue > 21) {
                playerMoney += playerBet;
                playerStrategy.endOfHand(Outcome.PLAYER_WIN, playerCards, dealerCards, playerBet, playerMoney);
            }
            // check for player win (neither has blackjack)
            else if (playerValue > dealerValue) {
                playerMoney += playerBet;
                playerStrategy.endOfHand(Outcome.PLAYER_WIN, playerCards, dealerCards, playerBet, playerMoney);
            }
            // check for player loss (neither has blackjack)
            else if (playerValue < dealerValue) {
                playerMoney -= playerBet;
                playerStrategy.endOfHand(Outcome.PLAYER_LOSS, playerCards, dealerCards, -playerBet, playerMoney);
            }
            // tie
            else {
                playerStrategy.endOfHand(Outcome.TIE, playerCards, dealerCards, 0, playerMoney);
            }
        }
    }

    /** Deal a card, reshuffling if necessary. */
    private Card dealACard()
    {
        if (cardsToDeal.size() == 0) {
            cardsToDeal = Card.generateShuffledDeck();
        }
        Card c = cardsToDeal.get(0);
        cardsToDeal.remove(0);
        return c;
    }

    /** Get the value of a blackjack hand as an integer. */
    public static int getValue(List<Card> cards)
    {
        // aces are always 11
        int numAces = 0;
        int sum = 0;
        for (Card c : cards) {
            sum += c.getRank().getHardValue();
            if (c.getRank() == Rank.ACE) {
                numAces++;
            }
        }
        while (sum > 21 && numAces > 0)
        {
            sum -= 10;
            numAces--;
        }
        return sum;
    }

    /** Get the value of a blackjack hand as a String, with "H" or "S" at the front. */
    public static String getValueAsString(List<Card> cards)
    {
        // aces are always 11 for now
        int numAces = 0;
        int numAcesChanged = 0;
        int sum = 0;
        for (Card c : cards) {
            sum += c.getRank().getHardValue();
            if (c.getRank() == Rank.ACE) {
                numAces++;
            }
        }
        while (sum > 21 && numAcesChanged != numAces)
        {
            sum -= 10;
            numAcesChanged++;
        }

        // is there an ace left we could switch from an 11 to 1?
        if (numAces > 0 && numAcesChanged < numAces) {
            return "S" + sum;
        }
        else {
            return "H" + sum;
        }
    }

}
