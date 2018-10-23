package org.fasttrackit.algorithm.andreeasauchea.catalogproduse;

import java.util.LinkedList;
import java.util.List;

public class Cart {
    private String numeCumparator;
    private List<Produs> produseCos = new LinkedList<>();

    public Cart(String numeCumparator){
        this.numeCumparator = numeCumparator;
    }

    public String getNumeCumparator() {
        return numeCumparator;
    }

    public void setNumeCumparator(String numeCumparator) {
        this.numeCumparator = numeCumparator;
    }

    public List<Produs> getProduseCos() {
        return produseCos;
    }

    public void setProduseCos(List<Produs> produseCos) {
        this.produseCos = produseCos;
    }

    public void addProdus(Produs produs){
        this.getProduseCos().add(produs);
    }

    public double costTotal(){
        double total = 0;
        for (int index =0; index<produseCos.size(); index++){
            Produs  produsDinCos = produseCos.get(index);
            total += produsDinCos.getPrice();
        }
        return total;
    }
}
