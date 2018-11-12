package org.fasttrackit.algorithm.andreeasauchea.exercitii;

import java.util.Scanner;

public class Exercitiu14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati cele 2 numere: ");
        int a = scan.nextInt();
        int n = scan.nextInt();
        double calcul = Math.pow(a, n);
        System.out.println(calcul);
    }
}
