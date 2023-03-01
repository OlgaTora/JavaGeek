package Seminar10.game.protection;

public class DropShield extends Shield {

    private final int height;

    private final boolean belt;

    public DropShield(int protection, int weightShield, int height, boolean belt) {
        super(protection, weightShield);
        this.height = height;
        this.belt = belt;
    }

    @Override
    public String toString() {
        return ("Dropshield" + super.toString()
                + ", height: " + height
                + ", belt: " + belt + ")");
    }
}
