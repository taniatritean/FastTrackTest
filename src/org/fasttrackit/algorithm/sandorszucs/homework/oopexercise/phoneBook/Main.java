package org.fasttrackit.algorithm.sandorszucs.homework.oopexercise.phoneBook;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static PhoneBook phoneBook = new PhoneBook();

    public static void main(String args[]) {

        print();
    }

    private static void print() {
        System.out.println("\n" +
                "What action do you want to perform?\n" +
                "Select 1 - to add a new contact.\n" +
                "Select 2 - to delete an existing contact.\n" +
                "Select 3 - to modify a contact.\n" +
                "Select 4 - to show all existing contacts.");

        int x = scanner.nextInt();
        switch (x) {
            case 1:
                phoneBook.addContact();
                print();
                break;
            case 2:
                phoneBook.deleteContact();
                print();
                break;
            case 3:
                phoneBook.modifyContact();
                print();
                break;
            case 4:
                phoneBook.showContacts();
                print();
                break;
            default:
                System.out.println("Such option is not found! Be more careful!");
                print();

        }
    }
}
