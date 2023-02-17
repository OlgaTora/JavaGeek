package Seminar8;

public abstract class Predator extends Animal {
    public Predator(String name) {
        super(name);
    }

    public String feed() {
        return "meat";
    }

    public String toString() {
        return "I'm eating " + feed();
    }
}
