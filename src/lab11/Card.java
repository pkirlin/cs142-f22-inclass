package lab11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** A Card has a rank and a suit.*/
public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank r, Suit s) {
        rank = r;
        suit = s;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public boolean equals(Object otherObj)
    {
        if (this == otherObj) return true;
        if (!(otherObj instanceof Card)) return false;
        Card otherCard = (Card)otherObj;
        return (rank == otherCard.rank && suit == otherCard.suit);
    }

    public String toString() {
        return rank.getSymbol() + "" + suit.getSymbol();
    }

    public static List<Card> generateShuffledDeck()
    {
        List<Card> cards = new ArrayList<Card>();
        for (Suit s : Suit.values())
        {
            for (Rank r : Rank.values())
            {
                cards.add(new Card(r, s));
            }
        }
        Collections.shuffle(cards);
        return cards;
    }


}
