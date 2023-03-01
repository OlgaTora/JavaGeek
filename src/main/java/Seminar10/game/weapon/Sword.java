package Seminar10.game.weapon;

public class Sword extends Melee {
    private final int lengthSword;

    public Sword(int lengthSword, int damagePoint) {
        super(damagePoint);
        this.lengthSword = lengthSword;
    }

    @Override
    public String toString() {
        return "Sword" + super.toString()
                + ", length: " + lengthSword + ")";
    }
}
