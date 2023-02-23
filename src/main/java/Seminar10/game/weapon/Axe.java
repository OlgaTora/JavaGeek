package Seminar10.game.weapon;

public class Axe extends Melee {
    private final int lengthAxe;

    public Axe(int damagePoint, int lengthAxe) {
        super(damagePoint);
        this.lengthAxe = lengthAxe;
    }

    @Override
    public String toString() {
        return "Axe" + super.toString()
                + ", length: " + lengthAxe;
    }
}
