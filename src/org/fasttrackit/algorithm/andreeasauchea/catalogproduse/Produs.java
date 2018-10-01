package org.fasttrackit.algorithm.andreeasauchea.catalogproduse;

public class Produs {
    private double price;
    private String name;
    private CategorieProdus category;

    public Produs(String name, double price, CategorieProdus category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
