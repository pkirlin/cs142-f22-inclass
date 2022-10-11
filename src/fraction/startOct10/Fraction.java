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

        // check if the fraction does not follow our
        // rules for negative fractions, and fix it.
        if (denominator < 0) {
            numerator = -numerator;  // num *= -1;
            denominator = -denominator;
        }
    }

    public Fraction negate() {
        int newNumerator = -numerator;
        int newDenominator = denominator;
        Fraction negativeFrac = new Fraction(newNumerator, newDenominator);
        return negativeFrac;
    }

    public Fraction add(Fraction otherFraction) {
        int newNumerator = numerator * otherFraction.denominator + denominator * otherFraction.numerator;
        int newDenominator = denominator * otherFraction.denominator;
        Fraction addFrac = new Fraction(newNumerator, newDenominator);
        return addFrac;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
