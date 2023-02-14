package Seminar7;

public class CurcedProduct extends Product {
    private int longevity;

    public CurcedProduct(String name, double cost, int longevity) {
        super(name, cost);
        this.longevity = longevity;
    }

    @Override
    public String toString() {
        return String.format("%s, Longevity : %d", super.toString(), longevity);
    }
}
