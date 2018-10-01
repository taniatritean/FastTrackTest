package org.fasttrackit.algorithm.andreeasauchea.catalogproduse;

import java.util.LinkedList;
import java.util.List;

public class CategorieProdus {
    private List<Produs> produse = new LinkedList<>();
    private String NumeCategorie;

    public CategorieProdus(String NumeCategorie) {
        this.NumeCategorie = NumeCategorie;
    }

    public void setNumeCategorie(String numeCategorie) {
        NumeCategorie = numeCategorie;
    }

    public String getNumeCategorie() {
        return NumeCategorie;
    }

    public List<Produs> getProduse() {
        return produse;
    }

    public void setProduse(List<Produs> produse) {
        this.produse = produse;
    }
}
