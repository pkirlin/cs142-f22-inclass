package lab11;

public enum Rank {
    ACE('A', 11),
    TWO('2', 2),
    THREE('3', 3),
    FOUR('4', 4),
    FIVE('5', 5),
    SIX('6', 6),
    SEVEN('7', 7),
    EIGHT('8', 8),
    NINE('9', 9),
    TEN('T', 10),
    JACK('J', 10), QUEEN('Q', 10), KING('K', 10);

    private char symbol;
    private int value;

    Rank(char symbol, int value)
    {
        this.symbol = symbol;
        this.value = value;
    }

    public char getSymbol() { return symbol; }

    /** Returns blackjack value of a rank, where ace=11. */
    public int getHardValue() {
        return value;
    }

    /** Returns blackjack value of a rank, where ace=1. */
    public int getSoftValue() {
        if (this == ACE) return 1;
        else return value;
    }
}
