package org.fasttrackit.algorithm.daniel.agenda;

public class Agenda {
    //Contact[] contacts=new Contact[3];

    //TODO - make this private - you can read about : incapsulation
    Contact primul;
    private String name;

    public Agenda(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void add(String firstname, String number) {

        Contact c = new Contact(firstname, number);
        if (primul == null) {
            primul = c;
            return;
        }
        Contact tmp = primul;
        for (; tmp.next != null; tmp = tmp.next) { // TODO - this can be written with while, and it looks bettwer
        }
        tmp.next = c;//after iteration we add the second contact
        // ca alta solutie unde sa nu ie nevoie sa iterezi toata lista la fiecare add - poti pastra in memorie in agenda si last Contact , si atunci poti sa il accesezi tot timpul
        // dar daca folosesti LinkedList asta vine de la sine la un add (se ocupa Linked List de pastrarea ordinii)

    }

    //returnam primul contact
    public String first() {
        return primul.toString();
    }

    //returnam al n-lea contact
    public String get(int i) {
        Contact tmp = primul;
        for (int index = 1; index < i; index++) {
            tmp = tmp.next;

        }
        return tmp.toString();
    }


}




