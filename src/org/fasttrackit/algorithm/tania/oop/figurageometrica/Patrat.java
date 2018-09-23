package org.fasttrackit.algorithm.tania.oop.figurageometrica;

public class Patrat implements FormaGeometricaTania {
    private int latura;

    public Patrat(int latura) {
        this.latura = latura;
    }

    public String getName() {
        return "square";
    }

    public double getArea() {
        return  latura * latura;
    }

    public double getPerimeter() {
        return latura * 4;
    }
}
