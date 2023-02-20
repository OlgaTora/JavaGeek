package Seminar8;

public class Hummingbird extends Herbivores implements Flyable {

    public Hummingbird(String name) {
        super(name);
    }

    public String toString() {
        return "I'm Hummingbird. " + super.toString()
                + ".  My height of fly is: " + heightOfFly();
    }

    public String say() {
        return "Piu";
    }

    @Override
    public int heightOfFly() {
        return 20;
    }
}
