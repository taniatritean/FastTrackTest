package org.fasttrackit.algorithm.andreeasauchea.scoala;

public class Modul {

    private String nume;
    private Curs curs;

    public Modul(Curs curs) {
        this.curs = curs;
        curs.addModule(this);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
