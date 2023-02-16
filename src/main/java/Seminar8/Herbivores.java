package Seminar8;

public abstract class Herbivores extends Animal {
    public Herbivores(String name) {
        super(name);
    }

    public String feed() {
        return "herb";
    }

    public String toString() {
        return "I'm eating " + feed();
    }
}
