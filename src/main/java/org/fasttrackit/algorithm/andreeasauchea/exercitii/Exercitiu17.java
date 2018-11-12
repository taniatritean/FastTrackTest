package org.fasttrackit.algorithm.andreeasauchea.exercitii;

import java.util.Scanner;

public class Exercitiu17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati numarul si puterea: ");
        int x = scan.nextInt();
        int n = scan.nextInt();
        double sum = 0;
        for(int i=0; i<=n; i++){
            sum += Math.pow(x, i);
        }
        System.out.println("Suma este " + sum);
    }
}
