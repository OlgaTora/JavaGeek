package Seminar10.game.protection;

public class Shield implements Protection {
    private final int protection;
    private final int weightShield;


    public Shield(int protection, int weightShield) {
        this.protection = protection;
        this.weightShield = weightShield;
    }

    @Override
    public int protect() {
        return protection;
    }

    @Override
    public String toString() {
        return ("(protection: " + protection
                + ", weight: " + weightShield);
    }
}
