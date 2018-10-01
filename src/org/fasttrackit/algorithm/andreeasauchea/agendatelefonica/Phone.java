package org.fasttrackit.algorithm.andreeasauchea.agendatelefonica;

public class Phone {
    public static void main(String[] args) {

        PhoneBook phoneBook1 = new PhoneBook();
        phoneBook1.create("Ion", "Pop", "0723949158");
        phoneBook1.create("Vasile", "Popescu", "0269405890");
        phoneBook1.create("Ilie", "Vlod", "074949494");
        PhoneBook phoneBook2 = new PhoneBook();
        phoneBook2.create("Maria", "Lala", "0764856487");
        phoneBook2.create("Anastasia", "Ilie", "0756451289");
        phoneBook2.create("Pop", "Pop", "0369408012");
        phoneBook1.showPhoneBook();
        phoneBook2.showPhoneBook();
        phoneBook2.show(2);
        phoneBook1.delete(1);
        phoneBook2.edit(2, "Irina", "Lilo", "0759484615");
        phoneBook1.showPhoneBook();
        phoneBook2.showPhoneBook();


    }
}
