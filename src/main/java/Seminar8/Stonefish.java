package Seminar8;

public class Stonefish extends Predator implements Swimable, Poisonable {
    public Stonefish(String name) {
        super(name);
    }

    public String toString() {
        return "I'm Stonefish. " + super.toString()
                + ". My speed of sweem is: " + speedSwim()
                + ". My poison is " + poisonLevel() + " level.";
    }

    @Override
    public String say() {
        return "Bul'";
    }

    @Override
    public int poisonLevel() {
        return 10;
    }

    @Override
    public int speedSwim() {
        return 1;
    }
}
