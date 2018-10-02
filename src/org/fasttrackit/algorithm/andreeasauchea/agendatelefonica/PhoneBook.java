package org.fasttrackit.algorithm.andreeasauchea.agendatelefonica;

import java.util.LinkedList;
import java.util.List;

public class PhoneBook {
    List<Person> personList = new LinkedList<>();

    public PhoneBook(){

    }

    public void create(String firstName, String lastName, String phoneNumber){
        Person person = new Person(firstName, lastName, phoneNumber);
        personList.add(person);
    }

    //afisare toata agenda
    public void showPhoneBook(){
        for (int index = 0; index<personList.size(); index++){
            Person person = personList.get(index);
            System.out.println("Nume: " + person.getLastName());
            System.out.println("Prenume: " + person.getFirstName());
            System.out.println("Numar de telefon: " + person.getPhoneNumber());
            System.out.println();
        }
    }

    //afisare
    public void show(int index){
        Person person = personList.get(index);
        System.out.println("Nume: " + person.getLastName());
        System.out.println("Prenume: " + person.getFirstName());
        System.out.println("Numar de telefon: " + person.getPhoneNumber());
        System.out.println();
    }

    //modificare
    public void edit(int index, String firstName, String lastName, String phoneNumber){
        Person person = personList.get(index);
        if (!person.getFirstName().equals(firstName)){
            person.setFirstName(firstName);
        }
        if (!person.getLastName().equals(lastName)){
            person.setLastName(lastName);
        }
        if(!person.getPhoneNumber().equals(phoneNumber)){
            person.setPhoneNumber(phoneNumber);
        }
    }

    //stergere
    public void delete(int index){
        personList.remove(index);
    }
}
