package org.fasttrackit.algorithm.david.OOP2.kevin;

//  2. Sa se genereze clasele necesare pt un catalog de produse. Catalog, produs, categorie de produse.
//  Un utilizator isi pune in cos 2 produse diferite, un scaun si un dulap. Sa se afiseze pe consola numele fiecarui produs si pretul lui si totalul de plata al elementelor din cos.

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static LinkedList<Catalog> cos=new LinkedList<>();

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        printCatalog();


    }
    private static void printCatalog(){
        System.out.println("Catalog:\n" +
                "Type 0 - for printBasket\n" +
                "Type 1 - for Obiecte Imbracaminte\n" +
                "Type 2 - for Obiecte Mobilier\n" +
                "Type 3 - for Catalog\n" );

        int x=scanner.nextInt();
        scanner.nextLine();

        switch(x){
            case 0:
                printBasket();
                break;
            case 1:
                obiecteImbracaminte();
                break;
            case 2:
                obiecteMobilier();
                break;
            case 3:
                printCatalog();
                break;
        }
    }
    private static void obiecteMobilier(){
        System.out.println("Obiecte Mobilier:\n" +
                "Type 0 - for printBasket\n" +
                "Type 1 - for Scaun\n" +
                "Type 2 - for Dulap\n" +
                "Type 3 - for Catalogn\n" +
                "Type 4 - for Obiecte mobilier\n");

        int x=scanner.nextInt();
        scanner.nextLine();

        switch(x){
            case 0:
                printBasket();
                break;
            case 1:
                scaun();
                break;
            case 2:
                dulap();
                break;
            case 3:
                printCatalog();
            case 4:
                obiecteMobilier();
        }
    }
    private static void obiecteImbracaminte(){
        System.out.println("Obiecte Imbracaminte:\n" +
                "Type 0 - for printBasket\n" +
                "Type 1 - for Papuci\n" +
                "Type 2 - for Bluza\n" +
                "Type 3 - for Catalog\n" +
                "Type 4 - for Obiecte Imbracaminte\n");

        int x=scanner.nextInt();
        scanner.nextLine();

        switch(x){
            case 0:
                printBasket();
                break;
            case 1:
                bluza();
                break;
            case 2:
                papuci();
                break;
            case 3:
                printCatalog();
            case 4:
                obiecteImbracaminte();
        }
    }
    private static void scaun(){
        Scaun nume=new Scaun();
        cos.add(nume);
        System.out.println("Do you want to pay "+nume.getPrice()+" $ for this chair?(type 'true' for yes and 'false' for no)");
        boolean daca=scanner.nextBoolean();
        scanner.nextLine();

        if(daca==false){
            cos.remove(nume);
            System.out.println("Chair not added");
        }else {
            System.out.println("Chair added");
        }
        printCatalog();
    }
    private static void papuci(){
        Papuci nume=new Papuci();
        cos.add(nume);
        System.out.println("Do you want to pay "+nume.getPrice()+" $ for this shoes?(type 'true' for yes and 'false' for no)");
        boolean daca=scanner.nextBoolean();
        scanner.nextLine();

        if(daca==false){
            cos.remove(nume);
            System.out.println("Shoes not added.");
        }else {
            System.out.println("Shoes added.");
        }
        printCatalog();
    }
    private static void dulap(){
        Dulap nume=new Dulap();
        cos.add(nume);
        System.out.println("Do you want to pay "+nume.getPrice()+" $ for this wardrobe?(type 'true' for yes and 'false' for no)");
        boolean daca=scanner.nextBoolean();
        scanner.nextLine();

        if(daca==false){
            cos.remove(nume);
            System.out.println("Wardrobe not added");
        }else {
            System.out.println("Wardrobe added");
        }
        printCatalog();
    }
    private static void bluza(){
        Bluza nume=new Bluza();
        cos.add(nume);
        System.out.println("Do you want to pay "+nume.getPrice()+" $ for this shirt?(type 'true' for yes and 'false' for no)");
        boolean daca=scanner.nextBoolean();
        scanner.nextLine();

        if(daca==false){
            cos.remove(nume);
            System.out.println("Shirt not added");
        }else {
            System.out.println("Shirt added");
        }
        printCatalog();
    }

    private static void printBasket(){
        if(cos.size()==0){
            System.out.println("The basket is empty.");
        }
        else {
            double totalPrice=0;
            for (int i = 0; i < cos.size(); i++) {
                System.out.print("Number " + i + " in the basket :");
                System.out.print(cos.get(i).getName()+" with the price of ");
                System.out.print(cos.get(i).getPrice());
                System.out.println();
                totalPrice+=cos.get(i).getPrice();
            }
            System.out.println("The total price equals to "+totalPrice);
        }

        printCatalog();
    }
}
