package org.fasttrackit.algorithm.david.AgendaTelefonica;

public class Contact {
    private String nume;
    private String prenume;
    private int numarTelefon;

    public Contact(String nume, String prenume, int numarTelefon) {
        this.nume = nume;
        this.prenume = prenume;
        this.numarTelefon = numarTelefon;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(int numarTelefon) {
        this.numarTelefon = numarTelefon;
    }
}
