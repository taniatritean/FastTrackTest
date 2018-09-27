package org.fasttrackit.algorithm.daniel.agenda;
import org.fasttrackit.algorithm.daniel.agenda.Agenda.*;
public class ProblemaAgenda  {

public static void main (String[] args) {

    Agenda AgendaMea= new Agenda("Personal Agenda");
    System.out.println(AgendaMea.getName());

    AgendaMea.add("Daniel", "1234567");
    AgendaMea.add("Tania", "1234567");
    AgendaMea.add("Ciaca", "1234567");
    AgendaMea.add("Sergius", "1234567");

    System.out.println(AgendaMea.toString());

    System.out.println(AgendaMea.first());
    System.out.println(AgendaMea.get(2));
    System.out.println(AgendaMea.get(3));
    System.out.println(AgendaMea.get(4));
}


}