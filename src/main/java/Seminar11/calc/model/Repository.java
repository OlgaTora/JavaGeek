package Seminar11.calc.model;


public interface Repository{

    void help();

    void saveResult(String result);

    Rational calcRational(Rational first, Rational second, String symbol);

    Complex calcComplex(Complex first, Complex second, String symbol);
}

