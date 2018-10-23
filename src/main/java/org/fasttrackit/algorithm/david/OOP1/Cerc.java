package org.fasttrackit.algorithm.david.OOP1;


public class Cerc implements FormeGeometrice {
    private int d;
    public Cerc(int diametru) {
        this.d=diametru;
    }
    public void getName(){
        System.out.println("The name is circle");
    }
    public void getArea(){
        int pi=Integer.parseInt(""+'π');
        System.out.println("The area of the circle is equal to "+((this.d/2)*(this.d/2)*pi));
    }
    public void getRadius(){
        System.out.println("The radius of the circle is equal to "+this.d/2);
    }
    public void getPerimeter(){
        System.out.println("The perimeter of the circle is equal to: "+(2*Math.PI*(d/2)));
    }
}
