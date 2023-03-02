package Seminar10.game.protection;

public class Backler extends Shield {

    private final String material;
    private final int diameter;

    public Backler(int protection, int weightShield, int diameter, String material) {
        super(protection, weightShield);
        this.diameter = diameter;
        this.material = material;
    }

    @Override
    public String toString() {
        return ("Backler" + super.toString()
                + ", diameter: " + diameter
                + ", material: " + material + ")");
    }
}
