package org.fasttrackit.algorithm.tania.oop.figurageometrica;

//Implementare a clasei figuraGeometrica- o subclasa ce trebuie sa implementee toate metodele interfetei
//Cerc va fi o fuguraGeometrica
public class CercTania1 implements FormaGeometricaTania {

    private int raza;

    public CercTania1(int raza) {
        this.raza = raza;
    }

    public String getName() {
        return "circle";
    }

    public double getArea() {
        return ((raza * raza) * Math.PI);
    }

    public int getRadius() {
        return raza;
    }

    public double getPerimeter() {
        return (2 * Math.PI * raza);
    }





}
