package org.fasttrackit.algorithm.david.OOP2version2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalaog {
    private Scanner scanner =new Scanner(System.in);
    private List<InterfataProdus> catalog=new ArrayList<>();
    public void adaugare(){
        System.out.println("What name the object you want to buy has?");
        String name=scanner.nextLine();
        System.out.println("What price does this object has?");
        int price=scanner.nextInt();
        scanner.nextLine();
        catalog.add(new Produs(name, price));
    }
    public void afisare(){
        int suma=0;
        for(int i=0;i<catalog.size();i++){
            InterfataProdus produs=catalog.get(i);
            System.out.println(i+" -> "+produs.getName()+" -> "+produs.getPrice()+"$");
            suma+=produs.getPrice();
        }
        System.out.println();
        System.out.println("The total sum equals to "+suma);
    }
}
