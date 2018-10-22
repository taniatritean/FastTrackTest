package org.fasttrackit.algorithm.daniel.lab8tema;

import org.fasttrackit.algorithm.tania.lab8.FilesUtil;

import javax.swing.*;
import java.io.*;

import static org.fasttrackit.algorithm.daniel.lab8tema.Agenda.contacte;
import static org.fasttrackit.algorithm.daniel.lab8tema.Contact.nrOfContacts;


public class Exerc {


    public static void main(String[] args) {

    Agenda agenda=new Agenda("Phone_Book");
    Contact c1=new Contact ("Daniel Ciaca",123456);
    Contact c2=new Contact ("Jack Wilshere",1234000);
    Contact c3=new Contact  ("Will smith",12121212);
   agenda.addContact(c1);
   agenda.addContact(c2);
   agenda.addContact(c3);

        System.out.println("Numarul de contacte din agenda : " + nrOfContacts);

        File myFile =new File("agenda.txt");

        try {
            FileWriter fw=new FileWriter(myFile);
            Writer output=new BufferedWriter(fw);
            for(Contact contact : contacte){
                output.write(contact + "\r\n");
            }
            output.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "I cannot create that file");
        }
    }
}
