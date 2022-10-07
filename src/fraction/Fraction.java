package fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int n, int d) {
        int divisor = ExtraMath.gcd(n, d);
        numerator = n/divisor;
        denominator = d/divisor;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
