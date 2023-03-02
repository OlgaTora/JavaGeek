package Seminar12.Solid1.srp;


public class SquareCount {

    private int side;

    public int getArea() {
        return side * side;
    }

    public SquareCount(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}
