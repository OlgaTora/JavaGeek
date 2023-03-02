package Seminar11.calc.model;

public class Complex {
    private final double real;
    private final double image;

    public Complex(double re, double im) {
        this.real = re;
        this.image = im;
    }

    public double getReal() {
        return real;
    }

    public double getImage() {
        return image;
    }

    public String toString() {
        return this.real + "+" + this.image + "j";
    }
}
