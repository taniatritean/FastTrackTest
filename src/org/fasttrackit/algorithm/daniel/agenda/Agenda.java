package org.fasttrackit.algorithm.daniel.agenda;

public class Agenda {
    //Contact[] contacts=new Contact[3];
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
        for (; tmp.next != null; tmp = tmp.next) {
        }
        tmp.next = c;//after iteration we add the second contact

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




