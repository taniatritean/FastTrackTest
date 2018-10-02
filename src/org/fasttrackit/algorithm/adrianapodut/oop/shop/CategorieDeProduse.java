package org.fasttrackit.algorithm.adrianapodut.oop.shop;

import java.util.ArrayList;
import java.util.List;

public class CategorieDeProduse {

    private String numeCategorie;
    private Catalog catalogulMagazinului;

    private List<Produs> produseleCategoriei = new ArrayList<>();

    public CategorieDeProduse(String numeCategorie, Catalog catalogulMagazinului) {
        this.numeCategorie = numeCategorie;
        this.catalogulMagazinului = catalogulMagazinului;
        catalogulMagazinului.adaugareCategorie(this);

    }

    public String getNumeCategorie() {
        return numeCategorie;
    }

    public List<Produs> getPoduseleCategoriei() {
        return produseleCategoriei;
    }

    public void setProduseleCategoriei(List<Produs> produse) {
        this.produseleCategoriei = produse;
    }

    public  void  adaugareProdusInCategorie(Produs produsulCeSeAdauga){
        produseleCategoriei.add(produsulCeSeAdauga);
    }

}
