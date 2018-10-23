package org.fasttrackit.algorithm.andreeasauchea.problemaoptionalalab7;

//1.	Se citeste de la tastatura sau dintr-un fisier (optional puteti invata citirea din fisiere)
//        o lista de obiecte Produs din cadrul unui magazin. Produsul are nume, categorie si pret.
//        Doua produse sunt considerate egale daca au acelasi nume.
//        -	Daca utilizatorul a introdus un duplicat, va rog aruncati o exceptie custom scrisa de voi:
//               DuplicatedProduct. - done
//        -	Sa se afiseze pe ecran toate elementele citite, ordonate alphabetic dupa nume. - done
//        -	Sa se afiseze toate produsele citite, grupate pe categorie
//              (sa aveti cel putin 2 produse in fiecare categorie, minim 3 categorii) - done
//        -	Sa se afiseze numarul produselor din fiecare categorie(cate elemente avem in fiecare category ex:
//        categorie1: 4 produse, categorie2: 3 produse) - done
//        -	Sa se afiseze din fiecare categorie produsul cel mai scump (folosind metoda toString din clasa Podus- sa se
//        returneze “produsul ” + nume+ “ din categoria ” +categorie+” are pretul ” +pret) - done


import java.util.Objects;

public class Produs {
    private String name;
    private String category;
    private double price;

    public Produs(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }


    @Override
    public boolean equals(Object o) throws DuplicatedProduct {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produs produs = (Produs) o;
        return Objects.equals(name, produs.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
