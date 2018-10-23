package org.fasttrackit.algorithm.david.OOP1;
public class Triunghi implements FormeGeometrice {
    private int l1;
    private int l2;
    private int l3;

    public Triunghi(int l1, int l2, int l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
    public void getName(){
        System.out.println("The name is triangle");
    }

    public void getPerimeter(){
        System.out.println("The perimeter of the triangle is equal to "+(l1+l2+l3));
    }
}
