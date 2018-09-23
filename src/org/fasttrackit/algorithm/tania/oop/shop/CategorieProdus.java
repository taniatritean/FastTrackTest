package org.fasttrackit.algorithm.tania.oop.shop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ttritean
 * @since 9/23/2018
 */
public class CategorieProdus {

    private String name;
    private String owner;

    private List<Produs> produse= new ArrayList<>();


    public CategorieProdus(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Produs> getProduse() {
        return produse;
    }

    public void setProduse(List<Produs> produse) {
        this.produse = produse;
    }
}
