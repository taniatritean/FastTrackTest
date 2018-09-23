package org.fasttrackit.algorithm.andreeasauchea.figurigeometrice;

public class Triunghi extends FiguraGeometrica {
    double laturatri1;
    double laturatri2;
    double laturatri3;

    public Triunghi(double laturatri1, double laturatri2, double laturatri3) {
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
