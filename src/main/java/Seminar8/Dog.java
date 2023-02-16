package Seminar8;

public class Dog extends Predator implements Runable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I'm Dog. " + super.toString()
                + ". My speed of run is: " + speedRun();
    }

    public String say() {
        return "Gaf";
    }

    @Override
    public int speedRun() {
        return 30;
    }
}
