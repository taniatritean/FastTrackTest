package org.fasttrackit.algorithm.georgiana;
import java.util.Scanner;
/**Media a N nr citite de la tastatura*/
public class Problema2 {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Dati numarul de numere:");
        n = input.nextInt();

        int[] numere = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Dati valoarea de pe pozitia " + (i + 1));
            numere[i] = input.nextInt();
            total = total + numere[i];
        }
        double MediaAritmetica;
        MediaAritmetica = total / n;
        System.out.println("Media Aritmetica:" + MediaAritmetica);
    }
}

       /** for(int i=0;i<n;i++)
        {
            System.out.println(numere[i]+" ");
        }*/