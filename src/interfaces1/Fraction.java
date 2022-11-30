package interfaces1;

public class Fraction implements Comparable<Fraction>{
    private int numer;
    private int denom;

    public Fraction(int newNumer, int newDenom) throws RuntimeException
    {
        numer = newNumer;
        denom = newDenom;
        int gcd = gcd(numer, denom);
        numer /= gcd;  // numer = numer/gcd;
        denom /= gcd;

        if (denom < 0)
        {
            numer = -numer;
            denom = -denom;
        }
        if (denom == 0) {
            throw new RuntimeException();
        }
    }

    public Fraction multiply(Fraction other)
    {
        int newNumer = numer * other.numer;
        int newDenom = denom * other.denom;
        Fraction answer = new Fraction(newNumer, newDenom);
        return answer;
    }

    public Fraction add(Fraction other)
    {
        int newNumer = numer * other.denom + denom * other.numer;
        int newDenom = denom * other.denom;
        Fraction answer = new Fraction(newNumer, newDenom);
        return answer;
    }

    public String toString()
    {
        return numer + "/" + denom;
    }

    private static int gcd(int a, int b)
    {
        if (b == 0) return Math.max(a, -a);
        else return gcd(b, a % b);
    }

    @Override
    public int compareTo(Fraction other) {
        if ((double)numer/denom > (double)other.numer/other.denom) {
            return 1;
        }
        else if ((double)numer/denom < (double)other.numer/other.denom) {
            return -1;
        }
        else {
            return 0;
        }
    }
}