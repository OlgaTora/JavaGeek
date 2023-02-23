package Seminar10.game.warriors;

import Seminar10.game.protection.Protection;
import Seminar10.game.weapon.Weapon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeamWarriors<T extends Warrior<Weapon, Protection>> implements Iterable<T> {
    List<T> warriors = new ArrayList<>();

    public void addWarrior(T t) {
        warriors.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return warriors.iterator();
    }

    public int getTeamHealth() {
        int sum = 0;
        for (T warrior : warriors
        ) {
            sum += warrior.getHealth();
        }
        return sum;
    }

    public int getTeamDamage() {
        int sum = 0;
        for (T warrior : warriors
        ) {
            sum += warrior.getWeapon().damage();

        }
        return sum;
    }

    public int getRange() {
        int maxRange = 0;
        for (T warrior : warriors
        ) {
            if (warrior instanceof Archer archer) {
                if (maxRange < archer.killDistance()) {
                    maxRange = archer.killDistance();
                }
            }
        }
        return maxRange;
    }

    public int getTeamMinProtect() {
        int minProtected = warriors.get(0).getProtection().protect();
        for (T warrior : warriors
        ) {
            if (minProtected > warrior.getProtection().protect()) {
                minProtected = warrior.getProtection().protect();
            }
        }
        return minProtected;
    }
}



