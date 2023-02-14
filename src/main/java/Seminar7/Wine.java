package Seminar7;

public class Wine extends Beverage {
    private double alc;

    public Wine(String name, double cost, double vol, double alc) {
        super(name, cost, vol);
        this.alc = alc;
    }

    @Override
    public String toString() {
        return String.format("%s, Alcogol: %.2f", super.toString(), alc);
    }
}

