package org.fasttrackit.algorithm.david.TemaMagazin;

import java.util.Objects;

public class Produs {
    private String nume;
    private String categorie;
    private int pret;

    @Override
    public String toString() {
        return "Produs{" +
                "nume='" + nume + '\'' +
                ", categorie='" + categorie + '\'' +
                ", pret=" + pret +
                '}';
    }

    public Produs(String nume, String categorie, int pret) {
        this.nume = nume;
        this.categorie = categorie;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produs)) return false;
        Produs produs = (Produs) o;
        return Objects.equals(nume, produs.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume);
    }
}
