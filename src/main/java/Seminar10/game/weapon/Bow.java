package Seminar10.game.weapon;

public class Bow extends Ranged {
    private final int arrowBow;

    public Bow(int damagePoint, int killDistance, int arrowBow) {
        super(damagePoint, killDistance);
        this.arrowBow = arrowBow;
    }

    @Override
    public String toString() {
        return "Bow" + super.toString()
                + ", arrows: " + arrowBow;
    }
}
