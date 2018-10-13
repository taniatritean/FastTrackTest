package org.fasttrackit.algorithm.tania.lab7;

import org.fasttrackit.algorithm.tania.lab7.exception.DuplicateProductException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author ttritean
 * @since 10/13/2018
 */
public class ProblemaLab7 {


//    1.	Se citeste de la tastatura sau dintr-un fisier (optional puteti invata citirea din fisiere)
// o lista de obiecte Produs din cadrul unui magazin. Produsul are nume, categorie si pret.
//    Doua produse sunt considerate egale daca au acelasi nume.
//    -	Daca utilizatorul a introdus un duplicat, va rog aruncati o exceptie custom scrisa de voi:
//    DuplicatedProduct.
//    -	Sa se afiseze pe ecran toate elementele citite, ordonate alphabetic dupa nume.
//    -	Sa se afiseze toate produsele citite, grupate pe categorie (sa aveti cel putin 2 produse in
// fiecare categorie, minim 3 categorii)
//    -	Sa se afiseze numarul produselor din fiecare categorie(cate elemente avem in fiecare category ex:
// categorie1: 4 produse, categorie2: 3 produse)
//    -	Sa se afiseze din fiecare categorie produsul cel mai scump (folosind metoda toString din clasa Podus-
// sa se returneze “produsul ” + nume+ “ din categoria ” +categorie+” are pretul ” +pret)


    public static void main(String args[]) {

        String categoryMobila = "mobila";
        String categoryMancare = "mancare";
        String categoryJucarii = "jucarii";
        Magazin magazin = new Magazin();
        try {
            magazin.addProduct(new Produs("dulap",10, categoryMobila));
        } catch (DuplicateProductException dpe) {
            System.out.println("Invalid product");
        }
        try {
            magazin.addProduct(new Produs("coltar",1000, categoryMobila));
        } catch (DuplicateProductException dpe) {
            System.out.println("Invalid product");
        }

        try {
            magazin.addProduct(new Produs("masa",14, categoryMobila));
        } catch (DuplicateProductException dpe) {
            System.out.println("Invalid product");
        }

        try {
            magazin.addProduct(new Produs("lapte",10, categoryMancare));
        } catch (DuplicateProductException dpe) {
            System.out.println("Invalid product");
        }
        try {
            magazin.addProduct(new Produs("lapte",14, categoryMancare));
        } catch (DuplicateProductException dpe) {
            System.out.println("Invalid product");
        }

        try {
            magazin.addProduct(new Produs("paine",5, categoryMancare));
        } catch (DuplicateProductException dpe) {
            System.out.println("Invalid product");
        }


        try {
            magazin.addProduct(new Produs("puzzle",7, categoryJucarii));
        } catch (DuplicateProductException dpe) {
            System.out.println("Invalid product");
        }
        try {
            magazin.addProduct(new Produs("minge",3, categoryJucarii));
        } catch (DuplicateProductException dpe) {
            System.out.println("Invalid product");
        }


        Map<String, Set<Produs>> produseByCategory = magazin.getProduseByCategory();
        for(String category: produseByCategory.keySet()) {//pt fiecare keye din map
            Set<Produs> produseForCategory = produseByCategory.get(category);//luat lista de produse dupa categorie
            Produs produsWithMaxPrice =  null;
            System.out.println("Categoria " + category + " are " + produseByCategory.size() +" produse:");
            for(Produs produs : produseForCategory) {
                System.out.println(produs);//aici va fi apelat toSTring
                if(produsWithMaxPrice == null || produs.getPrice() >produsWithMaxPrice.getPrice()) {
                    produsWithMaxPrice = produs;
                }
            }
            System.out.println("Produsul cu pretul maxim din categorie este: " + produsWithMaxPrice);
            System.out.println("-----------------------------------------");
        }
        System.out.println("Produsele sortate");
        List<Produs> allProductsSorted = magazin.getAllProductsSorted();
        for(Produs p :allProductsSorted) {
            System.out.println(p);
        }

    }
}
