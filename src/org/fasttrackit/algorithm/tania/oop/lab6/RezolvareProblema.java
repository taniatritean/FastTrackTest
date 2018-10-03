package org.fasttrackit.algorithm.tania.oop.lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ttritean
 * @since 10/2/2018
 */
public class RezolvareProblema {

    //TODO
//    Modelam obiectal
//    O scoala La care se inscriu studenti.
//    Scoala ofera 3 cursuri. fiecare curs
//    are 2 module.
//    Un elev trece cursul daca are minim
//    nota 5 la ambele module.
//    Profesorul asignat cursului da nota.
//
//    noi vom adauag minim 5 studenti la fiecare curs
//    2 cursuri legate de informatica,
// 1 curs legat de limbi straine
    public static void main(String[] args) {

        Curs curs1 = new Curs("cursul unu");
        curs1.setTip("info");
        Student student1 = new Student();
        student1.setNume("Ion");
        curs1.addStudent(student1);
        Profesor profesor1 = new Profesor("prof 1");
        curs1.setProfesorDeCurs(profesor1);

        tiparirePeConsola(curs1);

        Modul modul1 = new Modul(curs1);
        Modul modul2 = new Modul(curs1);
        Modul modul3 = new Modul(curs1);


        //create curs2
        Curs curs2 = new Curs("cursul doi de info");
        curs2.setTip("info");

        //create curs2
        Curs curs3 = new Curs("cursul unu de limbi straine");
        curs3.setTip("limbi straine");


        List<Curs> cursuri = new ArrayList<>();
        cursuri.add(curs1);
        cursuri.add(curs2);
        cursuri.add(curs3);

        for (int i = 0; i < cursuri.size(); i++) {
            Curs curs = cursuri.get(i);
            if (curs.getTip().equals("info")) {
                System.out.println(curs.getNume());
            }
        }


//AICI vom folosi un MAP - se mai poate numiDictionar
        List<Curs> cursuriInfo = new ArrayList<Curs>();
        cursuriInfo.add(curs1);
        cursuriInfo.add(curs2);
        List<Curs> cursuriLmb = new ArrayList<Curs>();
        cursuriLmb.add(curs3);

        Map<String, List<Curs>> mapCursuri = new HashMap<>();
        mapCursuri.put("info", cursuriInfo);

        mapCursuri.put("lmb", cursuriLmb);


        List<Curs> infoList = mapCursuri.get("info");


    }

    private static void tiparirePeConsola(Curs curs1) {

        System.out.println("Numele cursului este " + curs1.getNume());
        System.out.println("Numele profesorului este " + curs1.getProfesorDeCurs().getNume());
        System.out.println("magic string  prof este " +
                curs1.getProfesorDeCurs().getMagicString());


        System.out.println("Numele cursului este POINTER " + curs1);

        for (int i = 0; i < curs1.getStudenti().size(); i++) {
            System.out.println("Numele studentului este " +
                    curs1.getStudenti().get(i).getNume());
            System.out.println("magic string  studentului este " +
                    curs1.getStudenti().get(i).getMagicString());

        }


    }
}
