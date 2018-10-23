package org.fasttrackit.algorithm.andreeasauchea.temaLab8;

import org.omg.CORBA.PERSIST_STORE;

import java.util.*;

public class Rezolvare {

    public static void main(String[] args) {

        List<Person> indivizi = new ArrayList<>();

        Person person1 = new Person("Pop", "0754123456", "Vasile");
        Person person2 = new Person("Popescu", "0765789456", "Titi");
        Person person3 = new Person("Lala", "0798456123", "Lolo");

        indivizi.add(person1);
        indivizi.add(person2);
        indivizi.add(person3);

        System.out.println(indivizi.get(1).getForename());

        System.out.println(indivizi.size());

        indivizi.remove(1);

        System.out.println(indivizi.size());

        Set<Person> agendaTelefonica = new HashSet<>();

        Person person4 = new Person("Pop", "0732587945", "Ioana");
        Person person5 = new Person("Ioni", "07541234560", "Adina");

        agendaTelefonica.addAll(indivizi);
        agendaTelefonica.add(person4);
        agendaTelefonica.add(person5);

        Map<String, Person> sortareNume = new HashMap<>();

        sortareNume.put(person1.getName(), person1);
        sortareNume.put(person2.getName(), person2);
        sortareNume.put(person3.getName(), person3);
        sortareNume.put(person4.getName(), person4);
        sortareNume.put(person5.getName(), person5);

        Queue<Message> messages = new LinkedList<>();

        Message message1 = new Message("Monday", "Ala bala portocala");
        Message message2 = new Message("Lala", "Ini mini maini mo");
        Message message3 = new Message("Ioi", "Tra la la la la");

        ((LinkedList<Message>) messages).add(0, message1);
        ((LinkedList<Message>) messages).add(1, message2);
        ((LinkedList<Message>) messages).add(2, message3);


    }
}
