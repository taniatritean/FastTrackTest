package org.fasttrackit.algorithm.adrianapodut.temnalab8;

import java.io.Serializable;

public class Contact implements Serializable {
    private String nume;
    private String numar;

    public Contact(String nume, String numar) {
        this.nume = nume;
        this.numar = numar;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }
}
