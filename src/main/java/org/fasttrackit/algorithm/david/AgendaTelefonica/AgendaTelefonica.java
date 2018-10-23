package org.fasttrackit.algorithm.david.AgendaTelefonica;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TODO : question to think about: what will happen with thhe class if I say that the action will retrievedd not from the keyboard, but from a file,
// or from a voice message, or by clicking a keyboard number
//what wil be the impact of this new change request in your code, in your class
//try to think if this is the class that should be responsable to handle to input mechanism (so to know if it read from keyboard, or from file or something else)

//NICE WORK !!!!:)
public class AgendaTelefonica {
    private Scanner scanner=new Scanner(System.in);
    private List<Contact> agendaTelefonica=new ArrayList<>();

    public void adaugareContactNou(){
        System.out.println("Give the name of the contact:");
        String prenume=scanner.nextLine();
        System.out.println("Give the surname of the contact:");
        String nume=scanner.nextLine();
        System.out.println("Give the telephone number of the contact:");
        int numarTelefon=scanner.nextInt();
        scanner.nextLine();
        Contact x=new Contact(nume,prenume,numarTelefon);
        agendaTelefonica.add(x);

        System.out.println("Contact adaugat.");
    }

    public void stergereContact(){
        System.out.println("Give the index of the contact you wish to delete:");
        int i=(scanner.nextInt()-1);
        scanner.nextLine();

        try{
        agendaTelefonica.remove(i);
        System.out.println("Contact sters.");}
        catch(Exception e){
            System.out.println("Contact inexistent.");
        }
    }

    public void modificareContact(){
        System.out.println("Give the index of the contact you want to modify:");
        int i=scanner.nextInt()-1;
        scanner.nextLine();

        try {

            modificareContactSecondaryMethod(i);
            System.out.println("Do you want to modify anything else from this contact?(Y/N)");

            String daca = scanner.nextLine();
            switch (daca) {
                case "Y":
                    modificareContactSecondaryMethod(i);
                    break;
                case "N":
                    System.out.println("Noting else modified");
                    break;
            }
        }catch(Exception e){
            System.out.println("Contactul nu exista.");
        }
    }

    public void afisareContact(){
        if(agendaTelefonica.isEmpty()){
            System.out.println("There are no contacts.");
        }else {
            for (int i = 0; i < agendaTelefonica.size(); i++) {
                Contact contact = agendaTelefonica.get(i);
                System.out.println((i+1) + " -> " + contact.getPrenume() + " " + contact.getNume() + " : " + contact.getNumarTelefon());
            }
        }
    }

    private void modificareContactSecondaryMethod(int i){
        Contact modificare=agendaTelefonica.get(i);
        System.out.println("Type the number of the action you wish to perform:\n" +
                "Type 1 - for modifying the name\n" +
                "Type 2 - for modifying the surname\n" +
                "Type 3 - for modifying the telephone number\n" +
                "Type 4 - for doing nothing.");
        int x=scanner.nextInt();
        scanner.nextLine();
        switch(x){
            case 1:
                System.out.println("Enter the new name:");
                String numeNou=scanner.nextLine();
                modificare.setPrenume(numeNou);
                System.out.println("Name modified.");
                break;
            case 2:
                System.out.println("Enter the new surname:");
                String surNumeNou=scanner.nextLine();
                modificare.setNume(surNumeNou);
                System.out.println("Surname modified.");
                break;
            case 3:
                System.out.println("Enter the new telephone number:");
                int telephoneNumber=scanner.nextInt();
                scanner.nextLine();
                modificare.setNumarTelefon(telephoneNumber);
                System.out.println("Telephone number modified.");
                break;
            default:
                System.out.println("Nothing modified.");
                break;
        }
    }
}
