package Seminar8;

public abstract class Animal implements Sayable {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String feed();

    @Override
    public String toString() {
        return "My name is " + name;
    }
}
