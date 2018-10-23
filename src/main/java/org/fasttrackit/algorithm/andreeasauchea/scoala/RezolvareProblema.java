package org.fasttrackit.algorithm.andreeasauchea.scoala;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RezolvareProblema {
    public static void main(String[] args) {

        Curs curs1 = new Curs("Cursul unu");
        curs1.setTip("info");
        Student student1 = new Student();
        student1.setNume("Ion");
        curs1.addStudent(student1);
        Profesor profesor1 = new Profesor("prof 1");
        curs1.setProfesorDeCurs(profesor1);

        tiparirePeConsola(curs1);

        Modul modul1 = new Modul(curs1);
        Modul modul2 = new Modul(curs1);

        Curs curs2 = new Curs("Cursul doi");
        curs2.setTip("info");

        Curs curs3 = new Curs("Cursul trei");
        curs3.setTip("limbi straine");

       /* List<Curs> cursuri = new ArrayList<>();
        cursuri.add(curs1);
        cursuri.add(curs2);
        cursuri.add(curs3);

        for (int i=0; i<cursuri.size(); i++){
            Curs curs = cursuri.get(i);
            if (curs.getTip().equals("info")){
                System.out.println(curs.getNume());
            }
        }*/

       List<Curs> cursuriinfo = new ArrayList<Curs>();
        cursuriinfo.add(curs1);
        cursuriinfo.add(curs2);

       List<Curs> limbistraine = new ArrayList<Curs>();
        limbistraine.add(curs3);

        Map <String, List<Curs>> mapCursuri = new HashMap<>();
        mapCursuri.put("info", cursuriinfo);
        mapCursuri.put("lmb", limbistraine);

        List<Curs> infoList = mapCursuri.get("info");


    }

    private static void tiparirePeConsola(Curs curs1) {
        System.out.println("Numele cursului este " + curs1.getNume());
        System.out.println("Numele profesorului " + curs1.getProfesorDeCurs().getNume());
        System.out.println("magic string profesorului " + curs1.getProfesorDeCurs().getMagicString());

        for (int index=0; index<curs1.getStudenti().size(); index++){
            System.out.println("Numele studentului este " +
                    curs1.getStudenti().get(index).getNume());
            System.out.println("magic string studentului este " +
                    curs1.getStudenti().get(index).getMagicString());
        }

    }


}
