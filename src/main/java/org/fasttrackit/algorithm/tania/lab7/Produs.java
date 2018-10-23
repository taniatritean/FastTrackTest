package org.fasttrackit.algorithm.tania.lab7;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author ttritean
 * @since 10/13/2018
 */
public class Produs implements Comparable {

    private String name;
    private double price;
    private String category;


    public Produs() {
    }

    public Produs(String name, double price, String category) {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produs produs = (Produs) o;
        return  Objects.equals(name, produs.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produs{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", category='").append(category).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Object o) {
        //this method is called when we use Collections.sort
        //this can be achieved also with comparators (you can read about those in the books )
        //here we should check of nulls
        return name.compareTo(((Produs)o).getName());
    }
}
