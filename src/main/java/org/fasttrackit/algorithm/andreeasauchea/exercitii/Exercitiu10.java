package org.fasttrackit.algorithm.andreeasauchea.exercitii;

import java.util.Scanner;

public class Exercitiu10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati numarul de elemente ale sirului: ");
        int nr = scan.nextInt();
        int[] a = new int[nr];
        for (int i=0; i<nr; i++){
            System.out.println(" Dati al " + i + "-lea element al sirului ordonat crescator.");
            a[i] = scan.nextInt();
        }
        System.out.println("Dati numarul care trebuie gasit: ");
        int n = scan.nextInt();
        boolean gasit = false;
        int li=0;
        int ls=nr;
        while (li<ls && !gasit) {
            int mij = (li+ls)/2;
            if (n == a[mij]){
                System.out.println("Pozitia este " + mij);
                gasit = true;
            }
            if (n > a[mij]){
                li = mij+1; // daca ar fi fost ordonat descrescator aici ar fi fost ls = mij-1
            }
            if (n < a[mij]){
                ls = mij-1; // daca ar fi fost ordonat descrescator aici ar fi fost li = mij+1
            }
        }
        if (!gasit) {
            System.out.println(-1);
        }
    }
}
