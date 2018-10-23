package org.fasttrackit.algorithm.andreeasauchea.figurigeometrice;

public class Patrat extends FiguraGeometrica {
    double laturapatr;

    public Patrat(double laturapatr) {
        this.laturapatr = laturapatr;
    }

    public void denumire() {
        System.out.println("Acesta este un patrat");
    }

    public void perimetru() {
        double perimetrup = 4 * laturapatr;
        System.out.println("Perimetrul patratului este: " + perimetrup);
    }
}