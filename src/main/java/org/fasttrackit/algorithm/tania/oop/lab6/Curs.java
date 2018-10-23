package org.fasttrackit.algorithm.tania.oop.lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ttritean
 * @since 10/2/2018
 */
public class Curs {

    private int durata;
    private String nume;

    private String tip;

    private Modul modul1;
    private Modul modul2;
    private List<Student> studenti = new ArrayList<>();

    private Profesor profesorDeCurs;

    public Curs(String nume) {
        this.nume = nume;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public Profesor getProfesorDeCurs() {
        return profesorDeCurs;
    }

    public void setProfesorDeCurs(Profesor profesorDeCurs) {
        this.profesorDeCurs = profesorDeCurs;
    }

    public void addStudent(Student student) {
        studenti.add(student);
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return nume;
    }

    public void addModule(Modul modul) {
        if(modul1 == null) {
            modul1 = modul;
        }else if (modul2 == null) {
            modul2 = modul;
        } else {
            throw new IllegalArgumentException("You are not allowed");
        }

    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
