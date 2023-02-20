package Seminar8;

public class Elephant extends Herbivores implements Runable {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I'm Elephant. " + super.toString()
                + ". My speed of run is: " + speedRun();
    }

    public String say() {
        return "Uuuu";
    }

    @Override
    public int speedRun() {
        return 50;
    }
}
