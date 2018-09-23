package src.org.fasttrackit.algorithm.sandorszucs.homework.oopexercise;

public class Square extends GeometricShape {
    double squareSides;

    public Square (double squareSides) {
        this.squareSides = squareSides;
    }

    public void denomination () {
        System.out.println("This is a Square");
    }

    public void perimeter () {
        double perimeterSquare = 4 * squareSides;
        System.out.println("Perimeter of the Square is: "+ perimeterSquare);
        System.out.println();
    }
}
