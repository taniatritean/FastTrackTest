package org.fasttrackit.algorithm.georgiana;
//Se da un sir. Sa se extraga toate numerele intre doua valori si sa se puna intr-un alt sir care apoi sa se afiseze.

import java.util.Scanner;

public class Problema20 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Dati cele doua valori:");
        a = input.nextInt();
        b = input.nextInt();
        int dimensiuneSir;
        System.out.println("Dimensiunea sirului este:");
        dimensiuneSir = input.nextInt();
        int[] Sir = new int[dimensiuneSir];
        for (int index = 0;index<dimensiuneSir;index++)
        {
            System.out.println("Dati numarul de pe pozitia:"+(index+1));
            Sir[index] = input.nextInt();
        }
        int contor=0;
        for (int index=0;index<dimensiuneSir;index++)
        {
            if (Sir[index]>a&&Sir[index]<b)
                contor++;
        }
        int n=0;
        int[] Sir2 = new int[contor];
        for (int index1=0;index1<dimensiuneSir;index1++)
        {
            if (Sir[index1]>a&&Sir[index1]<b)
            {
                Sir2[n]= Sir[index1];
                n++;
            }
        }
        for (int index2=0;index2<n;index2++)
        {
            System.out.println(Sir2[index2]);
        }

    }
}
