package org.fasttrackit.algorithm.andreeasauchea;

import java.util.Scanner;

public class Exercitiu15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati numarul pentru care sa se calculeze factorialul: ");
        int nr = scan.nextInt();
        long fact = 1;
        for (int i=1; i<=nr; i++){
            fact *= i;
        }
        System.out.println("Factorialul este " + fact);
    }
}
