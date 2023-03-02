package Seminar11.calc.model;

import java.util.List;
import java.util.Objects;

public class CalcComplex extends Calculator {

    public CalcComplex(Logger logger) {
        super(logger);
    }

    public Complex toComplex(String number) {
        number = number.replace("j", "");
        number = number.replace("+", "/");
        List<String> numbers;
        numbers = List.of(number.split("/"));
        Complex complex = new Complex(Double.parseDouble(numbers.get(0))
                , Double.parseDouble(numbers.get(1)));
        return complex;
    }

    public Complex calc(Complex first, Complex second, String symbol) {
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
            real = real1 * real2 - image1 * image2;
            image = image1 * real2 + real1 * image2;

        } else if (Objects.equals(symbol, division)) {
            real = (real1 * real2 + image1 * image2) / (real2 * real2 + image2 * image2);
            image = (image1 * real2 - real1 * image2) / (real2 * real2 + image2 * image2);

        }
        Complex result = new Complex(real, image);
        return result;
    }

}

