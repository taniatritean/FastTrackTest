package org.fasttrackit.algorithm.daniel.lab8tema;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Agenda implements Serializable {
    private String agendaname;
    public static List<Contact> contacte= new ArrayList<>();


    public Agenda (String agendaname){
        this.agendaname=agendaname;
    }

    public List<Contact> getContacte() {
        return contacte;
    }

    public void setContacte(List<Contact> contacte) {
        this.contacte = contacte;
    }

    public void addContact(Contact contact){
        this.getContacte().add(contact);
    }




    }

