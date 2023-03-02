package Seminar12.Solid3;


import Seminar12.Solid3.osp.Circle;
import Seminar12.Solid3.osp.RightTriangle;
import Seminar12.Solid3.osp.Shape;
import Seminar12.Solid3.osp.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        shapes.add(new Circle(5));
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea += shape.getArea();
        }
        System.out.printf("Сумма площадей фигур равна %f \n", sumArea);
    }
}