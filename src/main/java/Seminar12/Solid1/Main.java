package Seminar12.Solid1;

import Seminar12.Solid1.srp.SquareCount;
import Seminar12.Solid1.srp.SquareView;

public class Main {
    public static void main(String[] args) {
        SquareCount squareCount = new SquareCount(5);
        SquareView squareView = new SquareView();
        System.out.printf("Площадь фигуры: %d \n", squareCount.getArea());
        squareView.draw(squareCount.getSide());
    }
}
