package org.fasttrackit.algorithm.adrianapodut.temnalab8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 2.	Implementati o agenda Telefonica citita si scrisa in fisier si calculate cate elemente sunt in agenda Telefonica folosind un field static
 */
public class AgendaTelefonicaAdriana {
    public static List<String> randurileAgendei = new ArrayList<>();

    public static void main(String args[]) throws IOException {

        //create the file
        File fisierAgenda = new File("AgendaTelefonicaAdriana.txt");

        //create a contact
        Contact contact1 = new Contact("Sergiu", "0745111111");
        //add (write) contact to the file
        FileUtilAdriana.saveInFile(fisierAgenda, contact1.getNume() + " " + contact1.getNumar());

        //create second contact
        Contact contact2 = new Contact("Maria", "0745222222");
        //add (write) contact to the file
        FileUtilAdriana.saveInFile(fisierAgenda, contact2.getNume() + " " + contact2.getNumar());

        //create third contact
        Contact contact3 = new Contact("Calin", "0745333333");
        //add (write) contact to the file
        FileUtilAdriana.saveInFile(fisierAgenda, contact2.getNume() + " " + contact2.getNumar());


       /* //read the file
        randurileAgendei = FileUtilAdriana.readFromFileStream("AgendaTelefonicaAdriana.txt", fisierAgenda);

        System.out.println(randurileAgendei);*/


        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fisierAgenda)));
        String firstLine = reader.readLine();
        reader.close();
        System.out.println(firstLine);


    }
}
