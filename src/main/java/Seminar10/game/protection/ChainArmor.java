package Seminar10.game.protection;

public class ChainArmor implements Protection {
    private final int protection;

    public ChainArmor(int protection) {
        this.protection = protection;
    }

    @Override
    public int protect() {
        return protection;
    }

    @Override
    public String toString() {
        return ("Chain armor(protection: " + protection + ")");
    }
}

