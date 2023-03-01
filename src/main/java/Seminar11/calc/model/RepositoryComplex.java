package Seminar11.calc.model;

import java.util.Objects;

public class RepositoryComplex extends RepositoryCalc{

    public RepositoryComplex(Logger logger) {
        super(logger);
    }

    @Override
    public Rational calcRational(Rational first, Rational second, String symbol) {
        return null;
    }

    public Complex calcComplex(Complex first, Complex second, String symbol) {
        double real = 0, image = 0;
        double real1 = first.getReal();
        double image1 = first.getImage();
        double real2 = second.getReal();
        double image2 = second.getImage();

        if (Objects.equals(symbol, addition)) {
            real = real1 + real2;
            image = image1 + image2;

        } else if (Objects.equals(symbol, subtract)) {
            real = real1 - real2;
            image = image1 - image2;

        } else if (Objects.equals(symbol, multiply)) {
            real = real1*real2 - image1*image2;
            image = image1*real2 + real1*image2;

        } else if (Objects.equals(symbol, division)) {
            real = (real1*real2 + image1*image2)/(real2*real2 + image2*image2);
            image = (image1*real2 - real1*image2)/(real2*real2 + image2*image2);

        }
        Complex result = new Complex(real, image);
        return result;
    }
}

