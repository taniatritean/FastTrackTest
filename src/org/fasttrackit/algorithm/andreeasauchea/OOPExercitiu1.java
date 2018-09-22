package org.fasttrackit.algorithm.andreeasauchea;
import java.util.ArrayList;

public class OOPExercitiu1 {
    public static void main(String[] args) {
        ArrayList forme = new ArrayList();
        FormeGeometrice cerc = new Cerc(3);
        FormeGeometrice patrat = new Patrat(4);
        FormeGeometrice triunghi = new Triunghi(2, 3, 4);
        cerc.denumire();
        cerc.perimetru();
        ((Cerc) cerc).raza();
        patrat.denumire();
        patrat.perimetru();
        triunghi.denumire();
        triunghi.perimetru();
    }
}

abstract class FormeGeometrice {
    abstract void denumire();
    abstract void perimetru();
}

class Cerc extends FormeGeometrice{
    double raza;
    Cerc(double raza) {
        this.raza = raza;
    }
    public void denumire(){
        System.out.println("Acesta este un cerc.");
    }
    public void perimetru(){
        double circumferinta = raza * 3.14 * 2;
        System.out.println("Circumferinta cercului este: " + circumferinta);
    }
    public void raza(){
        System.out.println("Raza cercului este: " + raza);
    }
}

class Patrat extends FormeGeometrice{
    double laturapatr;
    Patrat(double laturapatr) {
        this.laturapatr = laturapatr;
    }
    public void denumire(){
        System.out.println("Acesta este un patrat");
    }
    public void perimetru(){
        double perimetrup = 4 * laturapatr;
        System.out.println("Perimetrul patratului este: " + perimetrup);
    }
}

class Triunghi extends FormeGeometrice{
    double laturatri1;
    double laturatri2;
    double laturatri3;
    Triunghi(double laturatri1, double laturatri2, double laturatri3){
        this.laturatri1 = laturatri1;
        this.laturatri2 = laturatri2;
        this.laturatri3 = laturatri3;
    }
    public void denumire() {
        System.out.println("Acesta este un triunghi");
    }
    public void perimetru() {
        double perimetrutri = laturatri1 + laturatri2 + laturatri3;
        System.out.println("Perimetrul triunghiului este: " + perimetrutri);
    }
}


