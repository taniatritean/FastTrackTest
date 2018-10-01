package org.fasttrackit.algorithm.adrianapodut.oop.shop;

import java.util.ArrayList;
import java.util.List;

public class CosDeCumparaturi {

    public List<Produs> produseleDinCos = new ArrayList<>();
    private List<Integer> cantitatiProduse = new ArrayList<Integer>();

    private String nume;

    public CosDeCumparaturi() {
        nume = "cumparator 1";
    }

    public void adaugareProdusInCos(Produs produsDeAdaugat, int cantitate) {
        produseleDinCos.add(produsDeAdaugat);
        cantitatiProduse.add(cantitate);
    }

    public void calculareTotalProdus(Produs produs, int cantitate) {
        double totalProdus;
        //se calculeaza totalul pe produs
        totalProdus = produs.getPretProdus() * cantitate;
        System.out.println(produs.getNumeProdus() + " x " + cantitate + " = " + totalProdus);
    }

    public void calculareTotalCos() {
        double totalProdus;
        double totalCos = 0;
        //se calculeaza totalul cosului
        for (int i = 0; i < produseleDinCos.size(); i++) {
            //se calculeaza totalul pe produs
            totalProdus = produseleDinCos.get(i).getPretProdus() * cantitatiProduse.get(i);
            System.out.println(produseleDinCos.get(i).getNumeProdus() + " x " + cantitatiProduse.get(i) + " = " + totalProdus);
            //se calculeaza totalul pe cos
            totalCos += totalProdus;
        }
        System.out.println("Totalul cosului este: " + totalCos);
    }


}
