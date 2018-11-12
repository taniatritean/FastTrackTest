package org.fasttrackit.algorithm.andreeasauchea.Repository;

import org.fasttrackit.algorithm.andreeasauchea.agendatelefonica.Person;

import java.sql.SQLException;
import java.util.List;

public class TestPersonRepo {
    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();
        try {
//            personRepository.createPerson("Popescu", "Ion", "0725648789");
//            personRepository.createPerson("Ionescu", "Maria", "0725612389");
//            personRepository.createPerson("Pop", "Irina", "0726978789");
//            personRepository.deletePerson(2);
//            personRepository.updatePerson("Ionescu", "Mara", "0754978123", 1);
           List<Person> personList = personRepository.findAll();
           for(Person person : personList){
               System.out.println(person.toString());
           }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
