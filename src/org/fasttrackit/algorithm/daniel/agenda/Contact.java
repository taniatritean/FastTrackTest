package org.fasttrackit.algorithm.daniel.agenda;

public class Contact {
    //declaram variabile aici
    private final String number;
    private final String firstname;
    Contact next;


    public Contact(String firstname, String number) {
        this.firstname = firstname;
        this.number = number;
        next=null;


    }

    @Override
    public String toString() {
        return "Contact [ firstname= " + firstname + " number= " + number + " ]";
        }






}




