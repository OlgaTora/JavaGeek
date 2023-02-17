package Seminar8;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimals(List.of(new Cat("Leo"), new Dog("Bob"), new Cow("Marusya")
                , new Elephant("Biggy"), new Duck("Piskun"), new Hummingbird("Colybri")
                , new Scorpion("Baby"), new Stonefish("Prettygirl")));

        System.out.println("What say our zoo: ");
        for (Sayable sayable : zoo.getSayable()
        ) {
            System.out.print(sayable.say() + " ");
        }

        System.out.println("\n~~~~~~~~~~~~~~~~");
        System.out.println("Running animals: ");
        for (Runable animal : zoo.getRunable()) {
            System.out.println(animal);
        }
        System.out.println("\n~~~~~~~~~~~~~~~~");
        System.out.println("Flying animals: ");
        for (Flyable animal : zoo.getFlyable()) {
            System.out.println(animal);
        }
        System.out.println("\n~~~~~~~~~~~~~~~~");
        System.out.println("Swimming animals: ");
        for (Swimable animal : zoo.getSwimable()) {
            System.out.println(animal);
        }
        System.out.println("\n~~~~~~~~~~~~~~~~");
        System.out.println("Animals poisonous: ");
        for (Poisonable animal : zoo.getPoisonable()) {
            System.out.println(animal);
        }

        System.out.println("\n~~~~~~~~~~~~~~~~");
        System.out.println("Running winner: ");
        System.out.println(zoo.getSpeedRunWinner());
        System.out.println("\n~~~~~~~~~~~~~~~~");
        System.out.println("Flying winner: ");
        System.out.println(zoo.getHeightFlyWinner());
        System.out.println("\n~~~~~~~~~~~~~~~~");
        System.out.println("Swimming winner: ");
        System.out.println(zoo.getSpeedSwimWinner());
        System.out.println("\n~~~~~~~~~~~~~~~~");
        System.out.println("The most poisonous animal: ");
        System.out.println(zoo.getPoisonWinner());
    }
}
