package Seminar7;

public class Beverage extends Product {
    private double vol;

    public Beverage(String name, double cost, double vol) {
        super(name, cost);
        this.vol = vol;
    }

    public Beverage(String name, double cost) {
        super(name, cost);
    }

    @Override
    public String toString() {
        return String.format("%s, Volume: %.2f"
                , super.toString(), vol);
    }
}
