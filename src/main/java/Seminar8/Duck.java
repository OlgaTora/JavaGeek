package Seminar8;

public class Duck extends Herbivores implements Runable, Flyable, Swimable {

    public Duck(String name) {
        super(name);
    }

    public String toString() {
        return "I'm Duck. " + super.toString()
                + ". My speed of run is: " + speedRun()
                + ". My height of fly is: " + heightOfFly()
                + ". My speed of sweem is: " + speedSwim();
    }

    public String say() {
        return "Krya";
    }

    @Override
    public int speedRun() {
        return 5;
    }

    @Override
    public int heightOfFly() {
        return 30;
    }

    @Override
    public int speedSwim() {
        return 10;
    }
}
