package org.fasttrackit.algorithm.andreeasauchea.exercitii;

import java.util.HashSet;
import java.util.Set;

public class MiniProblemaSetB {
    public static void main(String[] args) {
        Set<Person> name = new HashSet<>();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        person1.setName("Ion");
        person2.setName("Ana");
        person3.setName("Ion");
        name.add(person1);
        name.add(person2);
        name.add(person3);

        System.out.println(name.size());
    }
}
