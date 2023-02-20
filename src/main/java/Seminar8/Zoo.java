package Seminar8;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    private Radio radio = new Radio();

    public List<Animal> addAnimals(List<Animal> animals) {
        this.animals.addAll(animals);
        return this.animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Sayable> getSayable() {
        List<Sayable> result = new ArrayList<>();
        for (Animal animal : animals
        ) {
            result.add(animal);
        }
        result.add(radio);
        return result;
    }

    public List<Runable> getRunable() {
        List<Runable> result = new ArrayList<>();
        for (Animal animal : animals
        ) {
            if (animal instanceof Runable) {
                result.add((Runable) animal);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Animal animal : animals
        ) {
            if (animal instanceof Flyable) {
                result.add((Flyable) animal);
            }
        }
        return result;
    }

    public List<Swimable> getSwimable() {
        List<Swimable> result = new ArrayList<>();
        for (Animal animal : animals
        ) {
            if (animal instanceof Swimable) {
                result.add((Swimable) animal);
            }
        }
        return result;
    }

    public List<Poisonable> getPoisonable() {
        List<Poisonable> result = new ArrayList<>();
        for (Animal animal : animals
        ) {
            if (animal instanceof Poisonable) {
                result.add((Poisonable) animal);
            }
        }
        return result;
    }

    public Runable getSpeedRunWinner() {
        List<Runable> runables = getRunable();
        Runable winner = runables.get(0);
        for (Runable animal : runables) {
            if (winner.speedRun() < animal.speedRun()) {
                winner = animal;
            }
        }
        return winner;
    }

    public Flyable getHeightFlyWinner() {
        List<Flyable> flyables = getFlyable();
        Flyable winner = flyables.get(0);
        for (Flyable animal : flyables) {
            if (winner.heightOfFly() < animal.heightOfFly()) {
                winner = animal;
            }
        }
        return winner;
    }

    public Swimable getSpeedSwimWinner() {
        List<Swimable> swimables = getSwimable();
        Swimable winner = swimables.get(0);
        for (Swimable animal : swimables) {
            if (winner.speedSwim() < animal.speedSwim()) {
                winner = animal;
            }
        }
        return winner;
    }

    public Poisonable getPoisonWinner() {
        List<Poisonable> poisonables = getPoisonable();
        Poisonable winner = poisonables.get(0);
        for (Poisonable animal : poisonables) {
            if (winner.poisonLevel() < animal.poisonLevel()) {
                winner = animal;
            }
        }
        return winner;
    }
}

