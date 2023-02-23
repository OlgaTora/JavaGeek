package Seminar10.game.warriors;

import Seminar10.game.protection.ChainArmor;
import Seminar10.game.weapon.Axe;

public class Militia extends Warrior<Axe, ChainArmor> {
    public Militia(String name, Axe axe, ChainArmor chainArmor, int health) {
        super(name, axe, chainArmor, health);
    }

    @Override
    public String toString() {
        return "***Militia: " + super.toString();
    }
}
