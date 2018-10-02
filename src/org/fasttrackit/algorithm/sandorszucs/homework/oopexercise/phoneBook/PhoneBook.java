package org.fasttrackit.algorithm.sandorszucs.homework.oopexercise.phoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {

    Scanner scanner = new Scanner(System.in);
    private List<Contacts> phoneBook = new ArrayList<>();

    //RIGHT IN HERE WE ADD CONTACTS TO PHONE BOOK
    public void addContact() {
        System.out.println("Enter the first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter the last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter the telephone number: ");
        int phoneNumber = scanner.nextInt();
        scanner.nextLine();
        Contacts newContacts = new Contacts(firstName, lastName, phoneNumber);
        phoneBook.add(newContacts);
        System.out.println("You have successfully added your contact");
    }

    // WITH THIS METHOD WE DELETE CONTACTS
    public void deleteContact() {
        System.out.println("Which contact would you like to delete?\n" +
                "REMINDER! Numbers start from 0! \n");

            for (int i = 0; i < phoneBook.size(); i++) {
                System.out.println(phoneBook.get(i).getFirstName() + " " + phoneBook.get(i).getLastName());
            }

        int removeContact = scanner.nextInt();
        try {
            phoneBook.remove(removeContact);
            System.out.println("Contact removed");
        } catch (Exception e) {
            System.out.println("Contact does not exist");
        }
    }

    // HERE YOU SELECT WHICH CONTACT WOULD YOU LIKE TO MODIFY
    public void modifyContact() {
        System.out.println("Enter the number for the contact you would like to modify. \n" +
                "REMINDER! Numbers start from 0!");
        int modifyContact = scanner.nextInt();
        for (int i = 0; i < phoneBook.size(); i++) {
            System.out.println("Name: " + phoneBook.get(i).getFirstName() + " " + phoneBook.get(i).getLastName()
            + " ---- Phone number: " + phoneBook.get(i).getPhoneNumber());
        }
        try {
            modifyContactInfo(modifyContact);
        }
        catch (Exception e) {
            System.out.println("The contact does not exist");
        }

    }

    //HERE YOU MODIFY THE DATA OF THE EXISITING CONTACTS
    public void modifyContactInfo(int i) {
        Contacts modfiy = phoneBook.get(i);
        System.out.println("What change would you like to commit?:\n" +
                "Select 1 - to modify first name of a contact\n" +
                "Select 2 - to modify last name of a contact\n" +
                "Select 3 - to modify the telephone number of a contact\n");
        int element = scanner.nextInt();
        scanner.nextLine();
        switch (element) {
            case 1:
                System.out.println("Enter the NEW first NAME:");
                String newFirstName = scanner.nextLine();
                modfiy.setFirstName(newFirstName);
                System.out.println("You have successfully changed your contact's first name");
                break;
            case 2:
                System.out.println("Enter the NEW last NAME:");
                String newLastName = scanner.nextLine();
                modfiy.setLastName(newLastName);
                System.out.println("You have successfully changed your contact's last name");
                break;
            case 3:
                System.out.println("Enter the NEW last PHONE NUMBER:");
                int newPhoneNumber = scanner.nextInt();
                modfiy.setPhoneNumber(newPhoneNumber);
                System.out.println("You have successfully changed your contact's phone number");
                break;
            default:
                System.out.println("No changes have been performed!");
        }


    }

    //WITH THIS METHOD YOU WILL SHOW ALL CONTACTS WHICH ARE STORED IN THE MEMORY ----- IF THERE ARE ANY
    public void showContacts() {
        if (phoneBook.isEmpty()) {
            System.out.println("Your phonebook is empty");
        } else {
            for (int i = 0; i < phoneBook.size(); i++) {
                System.out.println("Name: " +phoneBook.get(i).getFirstName() + " " + phoneBook.get(i).getLastName() + " ----- Phone number: "
                        + phoneBook.get(i).getPhoneNumber());
            }
        }
    }
}
