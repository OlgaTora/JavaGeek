package Seminar10.game.warriors;

import Seminar10.game.protection.Shield;
import Seminar10.game.protection.WithoutShield;
import Seminar10.game.weapon.Sword;

public class Swordsman extends Warrior<Sword, Shield> {
    public Swordsman(String name, Sword sword, Shield dropShield, int health) {
        super(name, sword, dropShield, health);
    }

    public Swordsman(String name, Sword sword, WithoutShield withoutShield, int health) {
        super(name, sword, withoutShield, health);
    }

    @Override
    public String toString() {
        return "***Swordsman: " + super.toString();
    }
}
