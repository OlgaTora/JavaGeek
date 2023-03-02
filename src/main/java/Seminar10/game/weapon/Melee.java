package Seminar10.game.weapon;

public class Melee implements Weapon {

    private final int damagePoint;

    public Melee(int damagePoint) {
        this.damagePoint = damagePoint;
    }

    @Override
    public int damage() {
        return damagePoint;
    }

    @Override
    public String toString() {
        return ("(damage: " + damagePoint);
    }
}
