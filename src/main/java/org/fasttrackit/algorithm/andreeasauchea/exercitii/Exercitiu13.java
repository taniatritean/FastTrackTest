package org.fasttrackit.algorithm.andreeasauchea.exercitii;

import java.util.Scanner;

public class Exercitiu13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati numarul: ");
        int nr = scan.nextInt();
        if (nr >= 9 && nr <= 24){
            System.out.println("True");
        } else
            System.out.println("False");
    }

}
