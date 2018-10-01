package org.fasttrackit.algorithm.andreeasauchea;

/*Sa se genereze clasele necesare pt un catalog de produse.
Catalog, produs, categorie de produse.
Un utilizator isi pune in cos 2 produse diferite, un scaun si un dulap.
Sa se afiseze pe consola numele fiecarui produs si pretul lui si totalul de plata al elementelor din cos.*/


import org.fasttrackit.algorithm.andreeasauchea.catalogproduse.Cart;
import org.fasttrackit.algorithm.andreeasauchea.catalogproduse.CatalogProduse;
import org.fasttrackit.algorithm.andreeasauchea.catalogproduse.CategorieProdus;
import org.fasttrackit.algorithm.andreeasauchea.catalogproduse.Produs;

import java.util.HashMap;
import java.util.List;

public class OOPExercitiu2 {
    public static void main(String[] args) {
        CatalogProduse magazin = new CatalogProduse();
        CategorieProdus Mobila = new CategorieProdus("Mobila");
        CategorieProdus Fructe = new CategorieProdus("Fructe");
        Produs dulap = new Produs("dulap", 400, Mobila);
        Produs scaun = new Produs("scanu", 100, Mobila);
        Produs mar = new Produs("mar", 2, Fructe);
        Produs portocala = new Produs("portocala", 5, Fructe);
        Cart cos = new Cart("client 1");
        cos.addProdus(dulap);
        cos.addProdus(scaun);
        cos.addProdus(mar);
        cos.addProdus(portocala);
        cos.addProdus(mar);
        System.out.println("Costul total al produselor din cos este " + cos.costTotal());
    }
}
