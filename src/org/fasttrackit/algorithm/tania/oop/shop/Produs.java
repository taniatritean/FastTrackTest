package org.fasttrackit.algorithm.tania.oop.shop;

/**
 * @author ttritean
 * @since 9/23/2018
 */
public class Produs {
    private String name;
    private double price;
    private CategorieProdus category;

    public Produs(String name, double price, CategorieProdus category) {
        this.name = name;
        this.price = price;
        this.category = category;
        //adaugam in categorie produsul
        category.getProduse().add(this);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CategorieProdus getCategory() {
        return category;
    }

    public void setCategory(CategorieProdus category) {
        this.category = category;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
