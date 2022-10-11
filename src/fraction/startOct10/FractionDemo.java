package fraction.startOct10;

public class FractionDemo {
    public static void main(String[] args) {
        Fraction frac = new Fraction(2, 7);
        Fraction frac2 = new Fraction(9, 16);
        System.out.println(frac);
        System.out.println(frac.negate());
        System.out.println(frac2.negate());
        System.out.println(frac2);
        System.out.println(frac.add(frac));
    }
}