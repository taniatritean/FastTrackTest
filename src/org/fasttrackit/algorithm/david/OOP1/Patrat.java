package org.fasttrackit.algorithm.david.OOP1;

public class Patrat implements FormeGeometrice {
    int latura;

    public Patrat(int latura) {

        this.latura = latura;
    }

    public void getName() {
        System.out.println("The name is square");
    }

    public void getArea() {
        System.out.println("The area of the square is equal to " + latura * latura);
    }

    public void getPerimeter() {
        System.out.println("The perimeter of the square is equal to " + (latura * 4));
    }
}
