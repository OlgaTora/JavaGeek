package Seminar8;

public class Cow extends Herbivores implements Runable {
    public Cow(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I'm Cow. " + super.toString()
                + ". My speed of run is: " + speedRun();
    }

    public String say() {
        return "Mu";
    }

    @Override
    public int speedRun() {
        return 20;
    }
}
