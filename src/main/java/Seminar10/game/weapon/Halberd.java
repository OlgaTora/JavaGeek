package Seminar10.game.weapon;

public class Halberd extends Melee {
    private final int weightHalberd;

    public Halberd(int damagePoint, int weightHalberd) {
        super(damagePoint);
        this.weightHalberd = weightHalberd;
    }

    @Override
    public String toString() {
        return "Halberd" + super.toString() +
                ", weight: " + weightHalberd + ")";
    }
}
