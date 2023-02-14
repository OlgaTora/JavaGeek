package Seminar7;

public class Water extends Product{
    private boolean gas;
    public Water(String name, double cost, boolean gas) {
        super(name, cost);
        this.gas = gas;
    }

    @Override
    public String toString() {
        return String.format("%s, Gas: %b", super.toString(), gas);
    }
}
