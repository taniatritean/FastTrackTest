package org.fasttrackit.algorithm.andreeasauchea.agendatelefonica;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Phone {
    public static void main(String[] args) {

        Person person1 = new Person("Ion", "Pop", "0723949158");
        Person person2 = new Person("Vasile", "Popescu", "0269405890");
        Person person3 = new Person("Ilie", "Vlod", "074949494");
        Person person4 = new Person("Maria", "Lala", "0764856487");
        Person person5 = new Person("Anastasia", "Ilie", "0756451289");
        Person person6 = new Person("Pop", "Pop", "0369408012");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);


        try {
            File statText = new File("src\\org\\fasttrackit\\algorithm\\andreeasauchea\\agendatelefonica\\file.txt");
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            Writer w = new BufferedWriter(osw);
            for (Person person : personList) {
                w.write(person.toString());
                ((BufferedWriter) w).newLine();
            }
            w.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file statsTest.txt");
        }
        PhoneBook phoneBook = new PhoneBook();

        String filePath = "src\\org\\fasttrackit\\algorithm\\andreeasauchea\\agendatelefonica\\file.txt";
        String line;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null){
                String[] parts = line.split(" ", 3);
                if (parts.length >= 3) {
                    String firstName = parts[0];
                    String lastName = parts[1];
                    String phoneNumber = parts[2];
                    Person person = new Person(firstName, lastName, phoneNumber);
                    phoneBook.add(person);
                } else {
                    System.out.println("ignoring line: " + line);
                }
            }

            reader.close();
        } catch (FileNotFoundException fnf) {
            System.out.println("Document inexistent.");
        } catch (IOException io){
            System.out.println("No input.");
        }

        System.out.println(PhoneBook.getNrPersoane());


//        PhoneBook phoneBook1 = new PhoneBook();
//        phoneBook1.create("Ion", "Pop", "0723949158");
//        phoneBook1.create("Vasile", "Popescu", "0269405890");
//        phoneBook1.create("Ilie", "Vlod", "074949494");
//        PhoneBook phoneBook2 = new PhoneBook();
//        phoneBook2.create("Maria", "Lala", "0764856487");
//        phoneBook2.create("Anastasia", "Ilie", "0756451289");
//        phoneBook2.create("Pop", "Pop", "0369408012");
//        phoneBook1.showPhoneBook();
//        phoneBook2.showPhoneBook();
//        phoneBook2.show(2);
//        phoneBook1.delete(1);
//        phoneBook2.edit(2, "Irina", "Lilo", "0759484615");
//        phoneBook1.showPhoneBook();
//        phoneBook2.showPhoneBook();


    }
}
