package Seminar8;

public class Scorpion extends Predator implements Runable, Poisonable {


    public Scorpion(String name) {
        super(name);
    }

    public String toString() {
        return "I'm Scorpion. " + super.toString()
                + ".  My speed of run is: " + speedRun()
                + ". My poison is " + poisonLevel() + " level.";
    }

    @Override
    public int speedRun() {
        return 1;
    }

    @Override
    public String say() {
        return "Trrrrrr";
    }

    @Override
    public int poisonLevel() {
        return 8;
    }
}
