package Seminar10.game.weapon;

public class Ranged implements Weapon {
    public int killDistance;
    private final int damagePoint;

    public Ranged(int damagePoint, int killDistance) {
        this.damagePoint = damagePoint;
        this.killDistance = killDistance;
    }

    public int getKillDistance() {
        return killDistance;
    }

    @Override
    public int damage() {
        return damagePoint;
    }

    @Override
    public String toString() {
        return ("(damage: " + damagePoint
                + ", kill distance: " + killDistance);
    }
}

