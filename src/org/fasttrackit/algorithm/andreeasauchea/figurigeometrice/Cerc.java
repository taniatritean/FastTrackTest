package org.fasttrackit.algorithm.andreeasauchea.figurigeometrice;

public class Cerc extends FiguraGeometrica {
    double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    public void denumire() {
        System.out.println("Acesta este un cerc.");
    }

    public void perimetru() {
        double circumferinta = raza * 3.14 * 2;
        System.out.println("Circumferinta cercului este: " + circumferinta);
    }

    public void raza() {
        System.out.println("Raza cercului este: " + raza);
    }
}
