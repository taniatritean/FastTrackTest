package org.fasttrackit.algorithm.andreeasauchea.exercitii;
import java.util.Scanner;
import java.util.Arrays;

public class Exercitiu3 {
    public static void main(String[] args) {
        System.out.println("Dati numarul de numere: ");
        Scanner scan = new Scanner(System.in);
        int nr = scan.nextInt();
        int[] numere = new int[nr];
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < nr; i++) {
            System.out.println("Dati al " + i + " -lea numar: ");
            numere[i] = scan.nextInt();
        }
        Arrays.sort(numere);
        System.out.println(numere[nr-1]);
    }
}
