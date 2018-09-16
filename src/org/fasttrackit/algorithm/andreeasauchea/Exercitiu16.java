package org.fasttrackit.algorithm.andreeasauchea;

import java.util.Scanner;

public class Exercitiu16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati numrul de elemente ale sirului: ");
        int nr = scan.nextInt();
        int[] a = new int[nr];
        for (int i=0; i<nr; i++){
            System.out.println("Dati elementul: ");
            a[i] = scan.nextInt();
        }
        for (int i=0; i<nr-1; i++){
            if (a[i]>a[i+1]){
                System.out.println("Numerele sunt " + a[i] + " si " + a[i+1]);
            }
        }
    }
}
