/**
 * Created by bjh970913 on 14/12/2016.
 * KU-computer-programming-II
 */
public class Rational extends Number implements Comparable<Rational> {
    private long numerator = 0;
    private long denominator = 1;

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;
        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }
        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational other) {
        long n, d;
        n = numerator * other.getDenominator() + other.getNumerator() * denominator;
        d = denominator * other.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational other) {
        long n, d;
        n = numerator * other.getDenominator() - other.getNumerator() * denominator;
        d = denominator * other.getDenominator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational other) {
        long n, d;
        n = numerator * other.getNumerator();
        d = denominator * other.getDenominator();
        return new Rational(n, d);
    }

    public Rational divide(Rational other) {
        long n, d;
        n = numerator * other.getDenominator();
        d = denominator * other.getNumerator();
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (numerator % denominator == 0) {
            return "" + (int) (numerator / denominator);
        } else {
            return numerator + "/" + denominator;
        }
    }

    @Override
    public boolean equals(Object obj) {
        Rational r = (Rational) obj;
        return numerator == r.getNumerator() && denominator == r.getDenominator();
    }

    @Override
    public int intValue() {
        return (int) (numerator / denominator);
    }

    @Override
    public long longValue() {
        return numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    @Override
    public int compareTo(Rational o) {
        return subtract(o).intValue();
    }
}
