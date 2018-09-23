package org.fasttrackit.algorithm.tania.oop.shop;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ttritean
 * @since 9/23/2018
 */
public class Shop {

    private String name;
    private Set<CategorieProdus> categoriiProduse= new HashSet<>();

    public Shop(String name) {
        this.name = name;
    }

    public Shop(String name, Set<CategorieProdus> categoriiProduse) {
        this.name = name;
        this.categoriiProduse = categoriiProduse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<CategorieProdus> getCategoriiProduse() {
        return categoriiProduse;
    }

    public void setCategoriiProduse(Set<CategorieProdus> categoriiProduse) {
        this.categoriiProduse = categoriiProduse;
    }
}
