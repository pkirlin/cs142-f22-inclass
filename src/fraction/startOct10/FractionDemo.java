package fraction.startOct10;

public class FractionDemo {
    public static void main(String[] args) {
        Fraction frac = new Fraction(1, 2);
        Fraction frac2 = new Fraction(1, 2);
        Fraction frac3 = new Fraction(2, 3);
        System.out.println(frac);
        System.out.println(frac2);
        System.out.println(frac.negate());
        System.out.println(frac2.negate());
        System.out.println(frac.add(frac2));


    }
}