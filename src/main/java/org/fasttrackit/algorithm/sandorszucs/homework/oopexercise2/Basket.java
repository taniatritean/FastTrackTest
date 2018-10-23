package org.fasttrackit.algorithm.sandorszucs.homework.oopexercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basket {

    Scanner scanner = new Scanner(System.in);
    private List<Product> Catalogue = new ArrayList<>();
    public void addProduct () {

        System.out.println("What would you like to buy?");
        String name = scanner.nextLine();
        System.out.println("What is the price for it?");
        double price = scanner.nextDouble();
        scanner.nextLine();
        Catalogue.add(new Product(name, price));
    }

    public void printbasket () {
        double basketSum = 0;
        for(int i = 0; i <Catalogue.size(); i++){
            Product product = Catalogue.get(i);
            System.out.println(i + "." + product.getProductName() + " is " + product.getProductPrice() + " RON");
            basketSum = basketSum + product.getProductPrice();
        }

        System.out.println("The amount you have to pay is: " + basketSum);
        System.out.println();
    }
}
