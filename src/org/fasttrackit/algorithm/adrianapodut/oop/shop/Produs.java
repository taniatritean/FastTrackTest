package org.fasttrackit.algorithm.adrianapodut.oop.shop;


public class Produs {

    private String numeProdus;
    private double pretProdus;
    private CategorieDeProduse categoriaProdusului;

    public Produs(String numeProdus, double pretProdus, CategorieDeProduse categoriaProdusului) {
        this.numeProdus = numeProdus;
        this.pretProdus = pretProdus;
        this.categoriaProdusului = categoriaProdusului;
        //se adauga produsul in lista categoriei sale
        categoriaProdusului.adaugareProdusInCategorie(this);
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public double getPretProdus() {
        return pretProdus;
    }


}
