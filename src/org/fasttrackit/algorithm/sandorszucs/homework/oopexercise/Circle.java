package src.org.fasttrackit.algorithm.sandorszucs.homework.oopexercise;

public class Circle extends GeometricShape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public void denomination() {
        System.out.println("This is a circle.");
    }
    public void perimeter () {
        double circumference = radius * 3.14 * 2;
        System.out.println("The circumference of the circle is: " + circumference);
        System.out.println();
    }
}