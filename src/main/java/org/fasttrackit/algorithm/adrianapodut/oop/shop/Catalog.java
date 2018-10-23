package org.fasttrackit.algorithm.adrianapodut.oop.shop;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private String numeMagazin;

    private List<CategorieDeProduse> categoriileCatalogului = new ArrayList<>();

    public Catalog(String numeMagazin) {
        this.numeMagazin = numeMagazin;
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public void setNumeMagazin(String numeMagazin) {
        this.numeMagazin = numeMagazin;
    }

    public void adaugareCategorie(CategorieDeProduse categoriaCeSeAdauga) {
        categoriileCatalogului.add(categoriaCeSeAdauga);
    }

    public List<CategorieDeProduse> getCategoriileCatalogului() {
        return categoriileCatalogului;
    }
}
