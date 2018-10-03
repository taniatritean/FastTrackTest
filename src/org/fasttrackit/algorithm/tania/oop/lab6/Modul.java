package org.fasttrackit.algorithm.tania.oop.lab6;

/**
 * @author ttritean
 * @since 10/2/2018
 */
public class Modul {
    private Curs curs;
    private String nume;


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
