package org.fasttrackit.algorithm.tania.lab7;

import org.fasttrackit.algorithm.tania.lab7.exception.DuplicateProductException;

import java.util.*;

/**
 * @author ttritean
 * @since 10/13/2018
 */
public class Magazin {

    private Map<String, Set<Produs>> produseByCategory = new HashMap<>();

    public void addProduct(Produs produs) throws DuplicateProductException {
        if (produs == null || produs.getCategory() == null) {
            //aruncam runtime exception
            throw new IllegalArgumentException("You can  not add a product that is null or without category");
        }
        //luam toate produsele din categorie
        Set<Produs> produses = produseByCategory.get(produs.getCategory());

        if (produses == null) {
            //e primul element din categorie, deci lista e null, deci prima data trebuie sa pun o lista
            // creata si sa o adaug in map la cheia categoriei
            produses = new HashSet<>();
            produseByCategory.put(produs.getCategory(), produses);

        }
        //adaug in lista de elemente de la cheie categorie din map. Impliciy se va adauga in map,
        // pt ca mapul refera lista aceasta
        boolean canIAdd = produses.add(produs);
        if (!canIAdd) {
            throw new DuplicateProductException("Produsul este duplicat");
        }
    }

    public boolean removeProduct(Produs produs) {
        if (produs == null || produs.getCategory() == null) {
            //aruncam runtime exception
            throw new IllegalArgumentException("You can  not delete a product that is null or without category");
        }

        boolean removed = produseByCategory.remove(produs.getCategory(), produs);
        return removed;
    }

    public Map<String, Set<Produs>> getProduseByCategory() {
        return produseByCategory;
    }

    //metoda care sorteaza toate produsele
    public List<Produs> getAllProductsSorted() {
//collectam toate produsele din toate
        List<Produs> allProducs = new ArrayList<>();
        for (Set<Produs> produse : produseByCategory.values()) {
            allProducs.addAll(produse);
        }
        Collections.sort(allProducs);
        return allProducs;


    }
}
