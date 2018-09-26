package org.fasttrackit.algorithm.david.AgendaTelefonica;

import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    private static AgendaTelefonica agendaTelefonica=new AgendaTelefonica();
    public static void main(String[] args) {
        dialog();
    }
    private static void dialog(){
        System.out.println("What action do you want to perform?\n" +
                "Type 1 - for adding new contact.\n" +
                "Type 2 - for deleting existing contact.\n" +
                "Type 3 - for modifying existing contact.\n" +
                "Type 4 - for displaying all contacts.\n" +
                "Type 5 - for doing nothing");
        int x=scanner.nextInt();
        scanner.nextLine();
        switch(x){
            case 1:
                agendaTelefonica.adaugareContactNou();
                dialog();
                break;
            case 2:
                agendaTelefonica.stergereContact();
                dialog();
                break;
            case 3:
                agendaTelefonica.modificareContact();
                dialog();
                break;
            case 4:
                agendaTelefonica.afisareContact();
                dialog();
                break;
            case 5:
                System.out.println("Contact list final.");
                break;
        }
    }

}
