package Seminar10.game.warriors;

import Seminar10.game.protection.Protection;
import Seminar10.game.weapon.Weapon;

import java.util.Random;

public abstract class Warrior<W extends Weapon, P extends Protection> {
    protected W weapon;
    protected P protection;
    private final String name;
    private int health;

    protected Warrior(String name, W weapon, P protection, int health) {
        this.name = name;
        this.weapon = weapon;
        this.protection = protection;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name is " + name +
                ", weapon is " + weapon +
                ",\n protect is " + protection +
                ", health is " + health + ")";
    }

    public W getWeapon() {
        return weapon;
    }

    public P getProtection() {
        return protection;
    }

    public boolean hit(Warrior recepient) {
        Random random = new Random();
        int damage = random.nextInt(0, weapon.damage());
        int treat = random.nextInt(0, protection.protect());
        return !recepient.reduceHealth(damage, treat);
    }

    public boolean reduceHealth(int damage, int treat) {
        health -= damage + treat;
        return health > 0;
    }

    public int getHealth() {
        return health;
    }
}
