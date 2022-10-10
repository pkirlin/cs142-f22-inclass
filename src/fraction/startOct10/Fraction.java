package fraction.startOct10;

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

        // check to make sure negative fractions
        // are formed correctly.
        if (denominator < 0) {
            denominator = -denominator;
            numerator = -numerator;
        }
    }

    public Fraction negate() {
        // return a new fraction that is the
        // negation of this fraction.
        int newNumerator = -numerator;
        int newDenominator = denominator;
        Fraction newFrac = new Fraction(newNumerator, newDenominator);
        return newFrac;
    }

    public Fraction add(Fraction otherFraction) {
        int newNumerator = numerator * otherFraction.denominator + denominator * otherFraction.numerator;
        int newDenominator = denominator * otherFraction.denominator;
        Fraction newFrac = new Fraction(newNumerator, newDenominator);
        return newFrac;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
