package src.org.fasttrackit.algorithm.sandorszucs.homework.oopexercise;

public class Triangle extends GeometricShape {
    double sideTriangle1;
    double sideTriangle2;
    double sideTriangle3;

    public Triangle(double sideTriangle1, double sideTriangle2, double sideTriangle3) {
        this.sideTriangle1 = sideTriangle1;
        this.sideTriangle2 = sideTriangle2;
        this.sideTriangle3 = sideTriangle3;
    }
    public void denomination () {
        System.out.println("This is a Triangle");
    }

    @Override
    public void perimeter() {
        double perimeterTriangle = sideTriangle1 + sideTriangle2 + sideTriangle3;
        System.out.println("Perimeter of the Triangle is: " + perimeterTriangle);
    }
}