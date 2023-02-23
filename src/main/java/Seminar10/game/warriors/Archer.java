package Seminar10.game.warriors;

import Seminar10.game.protection.ChainArmor;
import Seminar10.game.weapon.Bow;

public class Archer extends Warrior<Bow, ChainArmor> {

    public Archer(String name, Bow bow, ChainArmor chainArmor, int health) {
        super(name, bow, chainArmor, health);
    }

    /**
     * Archer could have his own kill distance, and we've to cast bow to weapon
     * or put Generic into class Warrior
     */
    public int killDistance() {
        return weapon.getKillDistance();
    }

    @Override
    public String toString() {
        return "***Archer: " + super.toString();
    }
}
