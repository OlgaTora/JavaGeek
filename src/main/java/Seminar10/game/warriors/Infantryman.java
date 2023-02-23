package Seminar10.game.warriors;

import Seminar10.game.protection.Shield;
import Seminar10.game.weapon.Halberd;

public class Infantryman extends Warrior<Halberd, Shield> {
    public Infantryman(String name, Halberd halberd, Shield backler, int health) {
        super(name, halberd, backler, health);
    }

    @Override
    public String toString() {
        return "***Infantryman: " + super.toString();
    }
}
