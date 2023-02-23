package Seminar10;

import Seminar10.game.protection.*;
import Seminar10.game.warriors.*;
import Seminar10.game.weapon.Axe;
import Seminar10.game.weapon.Bow;
import Seminar10.game.weapon.Halberd;
import Seminar10.game.weapon.Sword;


public class Main {
    public static void main(String[] args) {
        TeamWarriors<Warrior> teamA = new TeamWarriors<>();
        teamA.addWarrior(new Archer("Ivan", new Bow(10, 50, 5)
                , new ChainArmor(6), 100));
        teamA.addWarrior(new Infantryman("Eric", new Halberd(20, 60)
                , new Backler(10, 10, 15, "metall"), 100));
        teamA.addWarrior(new Swordsman("Patric", new Sword(20, 30)
                , new DropShield(8, 15,20, true), 100));

        TeamWarriors<Warrior> teamB = new TeamWarriors<>();
        teamB.addWarrior(new Archer("SuperArcher", new Bow(15, 80, 8),
                new ChainArmor(8), 100));
        teamB.addWarrior(new Archer("Bowboy", new Bow(12, 60, 7),
                new ChainArmor(7), 100));
        teamB.addWarrior(new Militia("Kuzma", new Axe(5, 3)
                , new ChainArmor(9), 100));


        System.out.println("Team A: ");
        for (Warrior warrior : teamA
        ) {
            System.out.println(warrior);
        }
        System.out.println("\n~~~~~~~~~~~~~~");
        System.out.println("Team B: ");
        for (Warrior warrior : teamB
        ) {
            System.out.println(warrior);
        }
        System.out.println("\n~~~~~~~~~~~~~~");
        System.out.println("Team A health is " + teamA.getTeamHealth());
        System.out.println("Team A damage is " + teamA.getTeamDamage());
        System.out.println("Team A min protected is " + teamA.getTeamMinProtect());
        System.out.println("Kill distance team A is : " + teamA.getRange());

        System.out.println("\n~~~~~~~~~~~~~~");
        System.out.println("Team B health is " + teamB.getTeamHealth());
        System.out.println("Team B damage is " + teamB.getTeamDamage());
        System.out.println("Team B min protected is " + teamB.getTeamMinProtect());
        System.out.println("Kill distance team B is : " + teamB.getRange());

        System.out.println("\n~~~~~~~~~~~~~~");
        Infantryman infantryman1 = new Infantryman("Big", new Halberd(20, 30)
                , new Backler(5, 10, 10, "wooden"), 100);
        Infantryman infantryman2 = new Infantryman("Small", new Halberd(10, 20)
                , new Backler(7, 15, 15, "steel"), 100);

        while (infantryman1.getHealth() > 0 && infantryman2.getHealth() > 0) {
            infantryman1.hit(infantryman2);
            System.out.println("1 hit 2:\n" + infantryman2);
            infantryman2.hit(infantryman1);
            System.out.println("2 hit 1:\n" + infantryman1);
        }

        System.out.print("Winner is: ");
        if (infantryman1.getHealth() > 0) {
            System.out.println(infantryman1.getName());
        } else {
            System.out.println(infantryman2.getName());
        }

        System.out.println("\n~~~~~~~~~~~~~~");
        System.out.println("Warriors without shield");
        Swordsman withoutshield1 = new Swordsman("A", new Sword(100, 20)
               , WithoutShield.getInstance(), 100);
        System.out.println(withoutshield1);
        Infantryman withoutshield2 = new Infantryman("A", new Halberd(100, 20)
                , WithoutShield.getInstance(), 100);
        System.out.println(withoutshield2);
    }
}

