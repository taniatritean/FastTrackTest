package org.fasttrackit.algorithm.sandorszucs.homework.oopexercise;

import java.util.ArrayList;
import java.util.List;

public class OOPExercise1 {
    public static void main (String args[]) {

        List<GeometricShape> shapes = new ArrayList<>();
        GeometricShape circle = new Circle(6);
        GeometricShape square = new Square(7);
        GeometricShape triangle = new Triangle(4,6,8);

        shapes.add(circle);
        shapes.add(square);
        shapes.add(triangle);

       for (int i = 0; i < shapes.size(); i++) {
           shapes.get(i).denomination();
           shapes.get(i).perimeter();

       }
    }
}