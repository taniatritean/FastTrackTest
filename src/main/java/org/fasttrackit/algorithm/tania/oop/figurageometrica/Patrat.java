package org.fasttrackit.algorithm.tania.oop.figurageometrica;


public class Patrat extends FiguraGeometricaCuLaturi {
    private int latura;

    public Patrat(int latura) {
        this.latura = latura;
    }

    public Patrat() {
        this.latura = 3;
    }

    public void test() {

        getColor();
        setColor(3);
    }
    @Override
    public int getNumberOfLaturi() {
        return 4;
    }

    //
    @Override
    public double getPerimeter() {
        return latura * 4;
    }

    public String getName() {
        return "square";
    }

    //
    public double getArea() {
        return latura * latura;
    }
//
//    public double getPerimeter() {
//
//    }
}
