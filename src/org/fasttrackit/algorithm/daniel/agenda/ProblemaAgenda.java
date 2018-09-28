package org.fasttrackit.algorithm.daniel.agenda;
import org.fasttrackit.algorithm.daniel.agenda.Agenda.*;
public class ProblemaAgenda  {

public static void main (String[] args) {

    //TODO - numele de variabile incep cu litere mici ca si best prcatce, ca sa ne fie usor sa distingem cine e clasa si cine e variablia
    //numele de clase incep cu litere mari
    Agenda AgendaMea= new Agenda("Personal Agenda");
    System.out.println(AgendaMea.getName());

    AgendaMea.add("Daniel", "1234567");
    AgendaMea.add("Tania", "1234567");
    AgendaMea.add("Ciaca", "1234567");
    AgendaMea.add("Sergius", "1234567");

    System.out.println(AgendaMea.toString());

    //TODO Try to write this with for  and after that with while
    System.out.println(AgendaMea.first());
    System.out.println(AgendaMea.get(2));
    System.out.println(AgendaMea.get(3));
    System.out.println(AgendaMea.get(4));

    //TODO- comments generale from TAnia :
    // Ai reusit sa simulezi o agenda ordonata in functie de ordinea inserarii elementelor in agenda -  nice ca si exercitiu de algoritmi :)
    // daca vrei sa citesti extra in Java exista un tip de lista predeined care ace exact asta - se numeste Vector ,
    // si daca vrei sa poti merge in lista in ambele directii di inaintesi inapoi - LinkedList
    //poti sa te uiti peste ele ce metode expun, si poti sa e uiti pecodu lor eventual sa vezi cum au implementat ei clasele de genul
    // ca si exercitiu - pooti incerca sa rescri folosind LinkedList  (in clasa Agenda vei avea un field de tip LinkedList<Contact> contacts = new LinkedList()
    // - o lista e conatcte ordonate dupa ordinea inserarii
    // )

    //inca o intrebare buna pe care sa o pui cand modelezi clasele: este intr-adevar responsabilitatea clasei Contact sa stie cine urmeaza dupa ea? sau e responsabilitatea altcuiva?
    //daca e responsabilitatea contactului, atunci fieldul  next din Coantact are sens, daca nu e atunci trebuie gasit alt loc unde sa pui aceasta informatie

    //abordarea aceasta de solutie - a implicat oarecum simularea unei liste ordonate -  f bun ca si exercitiu - te ajuta sa intelegi implementarea clasei LinkedList si ArrayList iar
    // in punct de vedere stric OOP, contactul nu ar trebui sa stie cine urmeaza dupa el, aceasta e responsabilitatea agenei normal pt ca ea are colectia de contacte

    //NICE WORK !!
}


}