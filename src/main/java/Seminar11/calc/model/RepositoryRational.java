package Seminar11.calc.model;

import java.util.List;
import java.util.Objects;

public class RepositoryRational extends RepositoryCalc {

    public RepositoryRational(Logger logger) {
        super(logger);
    }

    public Rational toRational(String number) {
        List<String> numbers;
        numbers = List.of(number.split("/"));
        Rational rational = new Rational(Long.parseLong(numbers.get(0)), Long.parseLong(numbers.get(1)));
        return rational;
    }

    public Rational calc(Rational first, Rational second, String symbol) {
        long numerator = 0, denominator = 1;
        long gcd = gcd(first.getNumerator(), first.getDenominator());
        long numerator1 = first.getNumerator() / gcd;
        long denominator1 = first.getDenominator() / gcd;
        gcd = gcd(second.getNumerator(), second.getDenominator());
        long numerator2 = second.getNumerator() / gcd;
        long denominator2 = second.getDenominator() / gcd;

        if (Objects.equals(symbol, addition)) {
            numerator1 *= denominator2;
            numerator2 *= denominator1;
            numerator = numerator1 + numerator2;
            denominator = denominator1 * denominator2;
            gcd = gcd(numerator, denominator);
            numerator /= gcd;
            denominator /= gcd;

        } else if (Objects.equals(symbol, subtract)) {
            numerator1 *= denominator2;
            numerator2 *= denominator1;
            numerator = numerator1 - numerator2;
            denominator = denominator1 * denominator2;
            long tempNumerator = numerator > 0 ? numerator : -numerator;
            gcd = gcd(tempNumerator, denominator);
            numerator /= gcd;
            denominator /= gcd;

        } else if (Objects.equals(symbol, multiply)) {
            numerator = numerator1 * numerator2;
            denominator = denominator1 * denominator2;
            gcd = gcd(numerator, denominator);
            numerator /= gcd;
            denominator /= gcd;

        } else if (Objects.equals(symbol, division)) {
            numerator = numerator1 * denominator2;
            denominator = denominator1 * numerator2;
            gcd = gcd(numerator, denominator);
            numerator /= gcd;
            denominator /= gcd;

        }
        Rational result = new Rational(numerator, denominator);
        return result;
    }

    private long gcd(long numerator, long denominator) {
        long temp = 1;
        if (numerator < denominator) {
            temp = numerator;
            numerator = denominator;
            denominator = temp;
        }

        while (temp != 0) {
            temp = numerator % denominator;
            numerator = denominator;
            denominator = temp;
        }
        return numerator;
    }
}
