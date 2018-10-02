
package org.fasttrackit.algorithm.andreeasauchea.catalogproduse;

import java.util.LinkedList;
import java.util.List;

public class CatalogProduse {
    private List<CategorieProdus> categorii = new LinkedList<>(); // mai ok ArrayList

    public CatalogProduse(){

    }

    public CatalogProduse (List<CategorieProdus> categorii){
        this.categorii = categorii;
    }

    public void setCategorii(List<CategorieProdus> categorii) {
        this.categorii = categorii;
    }

    public List<CategorieProdus> getCategorii() {
        return categorii;
    }
}