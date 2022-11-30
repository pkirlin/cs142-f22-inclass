package lab11;

public enum Suit {
    DIAMONDS('D'), CLUBS('C'), HEARTS('H'), SPADES('S');

    private char symbol;

    Suit(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() { return symbol; }
}
