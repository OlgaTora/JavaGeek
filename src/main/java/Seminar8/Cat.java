package Seminar8;

public class Cat extends Predator implements Runable {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I'm Cat. " + super.toString()
                + ". My speed of run is: " + speedRun();
    }

    public String say() {
        return "Maw";
    }

    @Override
    public int speedRun() {
        return 15;
    }
}
