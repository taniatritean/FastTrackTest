package org.fasttrackit.algorithm.tania.oop.figurageometrica;

public class Triunghi implements FormaGeometricaTania {
    private int l1;
    private int l2;
    private int l3;

    public Triunghi(int l1, int l2, int l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public String getName() {
        return "triangle";
    }

    public double getPerimeter() {
        return (l1 + l2 + l3);
    }
}
