package fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

}
